package demo.java.thread.shutdown;

public class TestShutdownThread extends Thread {

	@Override
	public void run() {
		
		try {
			
			while(true) {
				System.out.println("Running..." + isInterrupted());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
