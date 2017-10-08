package demo.java.classloader;

public class MyClassLoader extends ClassLoader {

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		System.out.println(3);
		return null;
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		System.out.println(1);
		if(name.equals("demo.java.classloader.TestClass")) return TestClass.class;
		return super.loadClass(name);
	}

	@Override
	protected Class<?> loadClass(String name, boolean resolve)
			throws ClassNotFoundException {
		System.out.println(2);
		return super.loadClass(name, resolve);
	}
	
	
}
