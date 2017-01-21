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
	 * ��ȡ��ǰ���е��߳�
	 * @return ��ǰ���е��߳�
	 */
	private Thread getCurrentThread() {
		return Thread.currentThread();
	}
}
