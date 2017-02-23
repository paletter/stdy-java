package demo.java.thread.base;

public class QueueThread extends Thread {
	
	private boolean isStop = false;
	
	public QueueThread() {
		
	}
	
	@Override
	public void run() {
		
		int i = 1;
		
		while(!isStop) {
			
			System.out.println(i);
			i ++;
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
