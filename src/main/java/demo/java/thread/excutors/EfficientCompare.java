package demo.java.thread.excutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EfficientCompare {

	static int j = 0;
	
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(j ++);
			}
		};
		
		long s = System.currentTimeMillis();
		for (int i = 0; i < 10000; i ++) {
			Thread t = new Thread(r);
			t.start();
		}
		System.out.println("###" + (System.currentTimeMillis() - s));
		
		ExecutorService httpHandlerThreadPool = Executors.newFixedThreadPool(1000);
		s = System.currentTimeMillis();
		for (int i = 0; i < 10000; i ++) {
			httpHandlerThreadPool.execute(r);
		}
		System.out.println("***" + (System.currentTimeMillis() - s));
	}
}
