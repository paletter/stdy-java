package demo.java.thread.base;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("MainThread run ");
		System.out.println("MainThread ID: " + Thread.currentThread().getId());
		System.out.println("MainThread Name: " + Thread.currentThread().getName());
		System.out.println("MainThread Priority: " + Thread.currentThread().getPriority());
		
		Thread t1 = new BaseThread("Thread 1");
		t1.setPriority(9);
		t1.start();
		
		BaseRunnable r = new BaseRunnable("Thread 2");
		Thread t2 = new Thread(r);
		t2.run();
	}
}
