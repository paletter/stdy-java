package demo.java.thread.base;

public class MainOfQueue {

	public static void main(String[] args) {
		
		Thread t1 = new QueueThread();
		t1.start();
	}
}
