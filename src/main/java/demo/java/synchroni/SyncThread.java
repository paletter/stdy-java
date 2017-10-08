package demo.java.synchroni;

public class SyncThread extends Thread {

	private LockObj lock;
	
	public SyncThread(LockObj lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		
		synchronized (lock) {
			
			for(int i = 0; i < 5; i ++) {
				
//				lock.print(getName());
				System.out.println(getName());
				
				try {
					Thread.currentThread().sleep(1000);
				} catch (Exception e) {
				}
			}
		}
	}
}
