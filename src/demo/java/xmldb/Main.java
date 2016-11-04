package demo.java.xmldb;

import java.io.File;
import java.util.Scanner;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import demo.java.xmldb.entity.User;

public class Main {

	public static void main(String[] args) {
		
//		File file = new File(System.getProperty("user.dir") +  "/src/demo/java/xmldb/xml/user.xml");
	
		try {
			
			UserReader.read(System.getProperty("user.dir") +  "/src/demo/java/xmldb/xml/user.xml");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
