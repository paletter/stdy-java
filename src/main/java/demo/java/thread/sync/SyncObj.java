package demo.java.thread.sync;

public class SyncObj {

	public synchronized void syncTest(int num) {

		for(int i = 0; i < 10000; i ++) {
			System.out.println("Thread " + num + ":" + i);
		}
	}
	
	public void notSyncTest(int num) {
		
		for(int i = 0; i < 10000; i ++) {
			System.out.println("Thread " + num + ":" + i);
		}
	}
}
