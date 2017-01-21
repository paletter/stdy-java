package demo.java.thread.strack;

public class StackObj1 {

	public static String name = "StackObj1";
	
	public static void method() {
		System.out.println("StackObj1.method");
		
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		
		System.out.println(name + " StackTraceElement.lent: " + stacks.length);
		for(StackTraceElement s : stacks) {
			System.out.println("======================================================");
			System.out.println(name + " StackClassName: " + s.getClassName());
			System.out.println(name + " StackFileName: " + s.getFileName());
			System.out.println(name + " StackLineNumber: " + s.getLineNumber());
			System.out.println(name + " StackMethodName: " + s.getMethodName());
			System.out.println(name + " StackClass: " + s.getClass());
			System.out.println("======================================================");
		}
	}
}
