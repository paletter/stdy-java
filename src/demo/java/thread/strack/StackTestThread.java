package demo.java.thread.strack;

public class StackTestThread extends Thread {

	private String name;
	
	public StackTestThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println("======================================================");
		System.out.println(name + " run");
		System.out.println(name + " ID: " + getCurrentThread().getId());
		System.out.println(name + " Name: " + getCurrentThread().getName());
		System.out.println(name + " Priority: " + getCurrentThread().getPriority());
		System.out.println("======================================================");

		StackTraceElement[] stacks = getCurrentStackTraceElements();
		for(StackTraceElement s : stacks) {
			System.out.println("======================================================");
			System.out.println(name + " StackClassName: " + s.getClassName());
			System.out.println(name + " StackFileName: " + s.getFileName());
			System.out.println(name + " StackLineNumber: " + s.getLineNumber());
			System.out.println(name + " StackMethodName: " + s.getMethodName());
			System.out.println(name + " StackClass: " + s.getClass());
			System.out.println("======================================================");
		}

		StackObj1.method();
		StackObj2.method();
		
		stacks = getCurrentStackTraceElements();
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
	
	/**
	 * 获取当前运行的线程堆栈
	 * @return StackTraceElement[]
	 */
	private StackTraceElement[] getCurrentStackTraceElements() {
		return getCurrentThread().getStackTrace();
	}
	
	/**
	 * 获取当前运行的线程
	 * @return Thread 当前运行的线程
	 */
	private Thread getCurrentThread() {
		return Thread.currentThread();
	}
}
