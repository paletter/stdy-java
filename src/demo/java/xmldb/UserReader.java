package demo.java.xmldb;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import demo.java.xmldb.entity.User;

public class UserReader {

	public static void read(String filePath) throws Exception {
		
		SAXReader reader = new SAXReader();
		File xml = new File(filePath);
		
		Document doc = reader.read(xml);
		Element root = doc.getRootElement();
		
		Element datas = root.element("datas");
		List<Element> dataList = datas.elements("data");
		
		List<User> userList = new ArrayList<>();
		for(Element data : dataList) {
			
			User user = new User();
			
			for(Iterator iterator = data.elementIterator(); iterator.hasNext(); ) {
				
				Element column = (Element) iterator.next();
				
				Class userClass = User.class;
				
				Class propertyTypeClass = getPropertyTypeClass(userClass, column.getName());
				String setMethodName = column.getName().substring(0, 1).toUpperCase() + column.getName().substring(1);
				Method setMethod = userClass.getMethod("set" + setMethodName, propertyTypeClass);
				
				if(propertyTypeClass.getName().equals("int") || propertyTypeClass.getName().equals(Integer.class.getName())) {
					setMethod.invoke(user, Integer.valueOf(column.getText()));
				} else {
					setMethod.invoke(user, column.getText());
				}
				
			}
			
			userList.add(user);
		}
		
		for(User user : userList) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getAge());
		}
	}
	
	private static Class getPropertyTypeClass(Class clazz, String name) {
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			if(f.getName().equals(name)) {
				return f.getType();
			}
		}
		return null;
	}
}
