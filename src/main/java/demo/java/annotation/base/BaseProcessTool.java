package demo.java.annotation.base;

import java.lang.reflect.Method;

public class BaseProcessTool {

	public static void process(String clazz) {
		
		Class targetClass = null;
		
		try {
			
			targetClass = Class.forName(clazz);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Method method : targetClass.getMethods()) {
			
			/**
			 * Method继承了java.lang.reflect.AnnotatedElement接口，有以下几种主要方法
			 * 
			 * - isAnnotationPresent(Class<? extends Annotation> annotationClass)：判断该程序元素上是否存在指定类型的注解，如果存在则返回true，否则返回false
			 * - getAnnotation(Class<T> annotationClass)：返回该程序元素上存在的指定类型的注解，如果该类型的注解不存在，则返回null 
			 * - Annotation[] getAnnotations()
			 */
			if(method.isAnnotationPresent(BaseMethodAnno.class)) {
				System.out.println("Annotated Method: " + method.getName());
			}
			
			if(method.isAnnotationPresent(BaseMethodWithArgAnno.class)) {
				System.out.println("Annotated Method with args: " + method.getName());
				BaseMethodWithArgAnno anno = method.getAnnotation(BaseMethodWithArgAnno.class);
				System.out.println("args: " + anno.arg0() + ", " + anno.arg1());
			}
		}
	}
}
