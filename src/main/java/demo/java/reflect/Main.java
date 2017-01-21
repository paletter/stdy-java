package demo.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			// 1 ��ȡClass�ķ�ʽ
			// 1.1 Class.forName
			Class userClass = Class.forName("demo.java.reflect.User");
			// 1.2 Entity.class
//			Class userClass = User.class;
			
			// 2 ʵ�������� Class.newInstance
			Object user = userClass.newInstance();
			
			// 3 ��ȡ����
			Method[] methods = userClass.getMethods();
			for(Method m : methods) {
//				System.out.println(m.getName());
			}
			
			// 4 ִ�з���
			Method m = userClass.getMethod("setName", String.class);
			m.invoke(user, "James");
			m = userClass.getMethod("getName");
//			System.out.println(m.invoke(user));
			
			// 5 ��ȡ��������
			Field[] fields = userClass.getDeclaredFields();
			for(Field f : fields) {
				System.out.println(f.getName() + "," + f.getType().getSimpleName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
