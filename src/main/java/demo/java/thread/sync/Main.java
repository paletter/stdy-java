package demo.java.thread.sync;

public class Main {

	public static SyncObj syncObj = new SyncObj();
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
//				syncObj.syncTest(1);
				syncObj.notSyncTest(1);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
//				syncObj.syncTest(2);
				syncObj.notSyncTest(2);
			}
		});
		
		t1.start();
		t2.start();
	}
}
