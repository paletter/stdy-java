package demo.java.xmldb;

import demo.java.xmldb.entity.User;



public class Main {

	public static void main(String[] args) {
		
		try {
			
//			User user = new User();
//			user.setAge(1);
//			user.setId("003");
//			user.setName("Angle");
//			UserOperator.insert(System.getProperty("user.dir") +  "/src/demo/java/xmldb/xml/user.xml", user);
			
//			UserOperator.delete(System.getProperty("user.dir") +  "/src/demo/java/xmldb/xml/user.xml", "003");
			
			User user = new User();
			user.setAge(1);
			user.setId("001");
			user.setName("Angle");
			UserOperator.update(System.getProperty("user.dir") +  "/src/demo/java/xmldb/xml/user.xml", user);
			
			UserReader.read(System.getProperty("user.dir") +  "/src/demo/java/xmldb/xml/user.xml");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
