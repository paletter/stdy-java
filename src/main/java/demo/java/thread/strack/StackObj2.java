package demo.java.thread.strack;

public class StackObj2 {

	public static String name = "StackObj2";
	
	public static void method() {
		System.out.println("StackObj2.method");
		
		System.out.println("======================================================");
		System.out.println(name + " StackClassName: " + Thread.currentThread().getStackTrace()[0].getClassName());
		System.out.println(name + " StackMethodName: " + Thread.currentThread().getStackTrace()[0].getMethodName());
		System.out.println("======================================================");
	}
}
