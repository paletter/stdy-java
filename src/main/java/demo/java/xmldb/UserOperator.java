package demo.java.xmldb;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import demo.java.xmldb.entity.User;

public class UserOperator {

	public static void insert(String filePath, User user) throws Exception {

		SAXReader reader = new SAXReader();
		File xml = new File(filePath);
		
		Document doc = reader.read(xml);
		Element root = doc.getRootElement();
		
		Element datas = root.element("datas");
		Element newData = datas.addElement("data");
		
		Class clazz = User.class;
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			
			Element column = newData.addElement(f.getName());
			
			String getMethodName = column.getName().substring(0, 1).toUpperCase() + column.getName().substring(1);
			Method method = clazz.getMethod("get" + getMethodName);
			String value = method.invoke(user).toString();
			column.setText(value);
		}
		
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setNewlines(true);
		
		PrintWriter pw = new PrintWriter(filePath);
		XMLWriter xw = new XMLWriter(pw, format);
		xw.write(doc);
		xw.flush();
		xw.close();
	}
	
	public static void delete(String filePath, String id) throws Exception {

		SAXReader reader = new SAXReader();
		File xml = new File(filePath);
		
		Document doc = reader.read(xml);
		Element root = doc.getRootElement();
		
		Element datas = root.element("datas");
		List<Element> dataList = datas.elements("data");
		
		for(Element data : dataList) {
			for(Iterator iterator = data.elementIterator(); iterator.hasNext(); ) {
				Element column = (Element) iterator.next();
				if(column.getName().equals("id") && column.getText().equals(id)) {
					datas.remove(data);
				}
			}
		}

		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setNewlines(true);
		
		PrintWriter pw = new PrintWriter(filePath);
		XMLWriter xw = new XMLWriter(pw, format);
		xw.write(doc);
		xw.flush();
		xw.close();
	}
	
	public static void update(String filePath, User user) throws Exception {

		SAXReader reader = new SAXReader();
		File xml = new File(filePath);
		
		Document doc = reader.read(xml);
		Element root = doc.getRootElement();
		
		Element datas = root.element("datas");
		List<Element> dataList = datas.elements("data");
		
		Element updateData = null;
		
		for(Element data : dataList) {
			for(Iterator iterator = data.elementIterator(); iterator.hasNext(); ) {
				Element column = (Element) iterator.next();
				if(column.getName().equals("id") && column.getText().equals(user.getId())) {
					updateData = data;
				}
			}
		}
		
		if(updateData != null) {

			Class clazz = User.class;
			
			for(Iterator iterator = updateData.elementIterator(); iterator.hasNext(); ) {
				Element column = (Element) iterator.next();
				Field[] fields = clazz.getDeclaredFields();
				for(Field f : fields) {
					if(column.getName().equals(f.getName())) {
						String getMethodName = column.getName().substring(0, 1).toUpperCase() + column.getName().substring(1);
						Method method = clazz.getMethod("get" + getMethodName);
						String value = method.invoke(user).toString();
						column.setText(value);
					}
				}
			}
			
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setNewlines(true);
			
			PrintWriter pw = new PrintWriter(filePath);
			XMLWriter xw = new XMLWriter(pw, format);
			xw.write(doc);
			xw.flush();
			xw.close();
		}
	}
}
