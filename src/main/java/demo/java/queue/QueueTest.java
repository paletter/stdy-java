package demo.java.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueTest {

	public static void main(String[] args) {
		
		testConcurrentLinkedQueue();
		
	}
	
	public static void testLinkedListQueue() {
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
	
	public static void testBlockingQueue() {

		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(5);
		bq.offer(1);
		bq.offer(2);
		bq.offer(3);
		
		System.out.println(bq.poll());
		System.out.println(bq.poll());
		System.out.println(bq.poll());
	}
	
	public static void testConcurrentLinkedQueue() {
		
		Queue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
		clq.offer(1);
		clq.offer(2);
		clq.offer(3);
		
		System.out.println(clq.poll());
		System.out.println(clq.poll());
		System.out.println(clq.poll());
	}
}
