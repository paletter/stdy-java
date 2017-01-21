package demo.java.thread.base;

public class BaseThread extends Thread {

	private String name;
	
	public BaseThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name + " run");
		System.out.println(name + " ID: " + getCurrentThread().getId());
		System.out.println(name + " Name: " + getCurrentThread().getName());
		System.out.println(name + " Priority: " + getCurrentThread().getPriority());
		
		try {
			
			Thread.currentThread().sleep(3000);
			System.out.println(name + " go");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡ��ǰ���е��߳�
	 * @return ��ǰ���е��߳�
	 */
	private Thread getCurrentThread() {
		return Thread.currentThread();
	}
}
