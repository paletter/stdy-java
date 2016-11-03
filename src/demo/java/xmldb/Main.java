package demo.java.xmldb;

import java.io.File;
import java.util.Scanner;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException {
		
		File file = new File("xml/user.xml");
		
		System.out.println(file.isFile());
		System.out.println(file.getPath());
		
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder = factory.newDocumentBuilder();
//		
//		Document doc = builder.parse(file);
	}
}
