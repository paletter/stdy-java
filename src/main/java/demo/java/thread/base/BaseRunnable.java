package demo.java.thread.base;

public class BaseRunnable implements Runnable {

	private String name;
	
	public BaseRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name + " run");
		System.out.println(name + " ID: " + getCurrentThread().getId());
		System.out.println(name + " Name: " + getCurrentThread().getName());
		System.out.println(name + " Priority: " + getCurrentThread().getPriority());
	}
	
	/**
	 * 获取当前运行的线程
	 * @return 当前运行的线程
	 */
	private Thread getCurrentThread() {
		return Thread.currentThread();
	}
}
