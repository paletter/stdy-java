package demo.java.thread.strack;

public class Main {

	public static void main(String[] args) {

		System.out.println("MainThread run ");
		System.out.println("MainThread ID: " + Thread.currentThread().getId());
		System.out.println("MainThread Name: " + Thread.currentThread().getName());
		System.out.println("MainThread Priority: " + Thread.currentThread().getPriority());
		
		StackTestThread t = new StackTestThread("Thread 1");
		t.start();
	}
}
