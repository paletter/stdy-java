package demo.java.thread.excutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i < 1; i ++) {
			final int x = i;
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(x);
				}
			});
		}
		
		while(true) {}
	}
}
