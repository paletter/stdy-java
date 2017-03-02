package demo.java.thread.shutdown;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		TestShutdownThread t = new TestShutdownThread();
		
		t.start();
		
		Thread.currentThread().sleep(100);
		
		t.interrupt();
	}
}
