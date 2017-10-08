package demo.java.synchroni;

public class SyncMain {

	public static void main(String[] args) {
		
		LockObj lock = new LockObj();
		
		SyncThread t1 = new SyncThread(lock);
		t1.setName("t1");
		
		SyncThread t2 = new SyncThread(lock);
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}
}
