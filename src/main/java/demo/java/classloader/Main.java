package demo.java.classloader;

import sun.reflect.Reflection;

public class Main {

	public static void main(String[] args) {
		
		ClassLoader cl = TestClass.class.getClassLoader();
		System.out.println(cl.toString());
	}
}
