package demo.java.annotation.intercept;

import java.lang.reflect.Method;

public class InterProcessTool {

	public static void process(String clazz) throws Exception {

		Class targetClass = null;
		
		try {
			
			targetClass = Class.forName(clazz);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Method method : targetClass.getMethods()) {
			
			if(method.isAnnotationPresent(InterMethodAnno.class)) {
				System.out.println("Annotated Method: " + method.getName());
				System.out.println("Before Execute Method");
				method.invoke(targetClass.newInstance());
				System.out.println("After Execute Method");
			}
		}
	}
}
