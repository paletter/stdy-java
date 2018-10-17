package demo.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public Main2() {

		try {
			
			Class userClass = Class.forName("demo.java.reflect.User");
//			Class userClass = User.class;
			
			Object user = userClass.newInstance();
			
			Method[] methods = userClass.getMethods();
			for(Method m : methods) {
//				System.out.println(m.getName());
				
				if(m.getName().equals("setName")) {
					
					
					System.out.println("---------");
					for(Parameter p : m.getParameters()) {
						System.out.println(p.getName());
					}
					System.out.println("---------");
					
					
					List<String> p = new ArrayList<String>();
					p.add("James");
					m.invoke(user, p.toArray());
					System.out.println("-----------");
				}
			}
			
			Method m = userClass.getMethod("setName", String.class);
			m.invoke(user, "James");
			m = userClass.getMethod("getName");
//			System.out.println(m.invoke(user));
			
			Field[] fields = userClass.getDeclaredFields();
			for(Field f : fields) {
				System.out.println(f.getName() + "," + f.getType().getSimpleName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
