package demo.java.classloader;


public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println(TestClass.class.getName());
		
		Class c = Class.forName(TestClass.class.getName(), 
				true, new MyClassLoader());
		
		System.out.println(c);
	}
}
