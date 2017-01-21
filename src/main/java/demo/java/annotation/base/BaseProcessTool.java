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
			 * Method�̳���java.lang.reflect.AnnotatedElement�ӿڣ������¼�����Ҫ����
			 * 
			 * - isAnnotationPresent(Class<? extends Annotation> annotationClass)���жϸó���Ԫ�����Ƿ����ָ�����͵�ע�⣬��������򷵻�true�����򷵻�false
			 * - getAnnotation(Class<T> annotationClass)�����ظó���Ԫ���ϴ��ڵ�ָ�����͵�ע�⣬��������͵�ע�ⲻ���ڣ��򷵻�null 
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
