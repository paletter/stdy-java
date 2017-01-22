package demo.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStdy {

	public static void testInsertElementInLast(int num) {
		List<Integer> l = new LinkedList<Integer>();
		
		System.out.println("Start LinkedList Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			l.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End LinkedList Insert! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testInsertElementInFirst(int num) {
		List<Integer> l = new LinkedList<Integer>();
		
		System.out.println("Start LinkedList Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			l.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End LinkedList Insert! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testRemoveByObj() {
		List<Integer> l = new LinkedList<Integer>();
		
		for(int i = 0; i < 400000; i ++) {
			l.add(i);
		}
		
		System.out.println("Start LinkedList Remove...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i ++) {
			l.remove(Integer.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("End LinkedList Remove! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testRemoveByIndex() {
		List<Integer> l = new LinkedList<Integer>();
		
		for(int i = 0; i < 40000; i ++) {
			l.add(i);
		}
		
		System.out.println("Start LinkedList Remove...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 20000; i ++) {
			l.remove(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End LinkedList Remove! Result: " + (end - start));
		System.out.println("================================================");
	}
	

	public static void testIterate() {
		List<Integer> l = new LinkedList<Integer>();
		
		for(int i = 0; i < 100000; i ++) {
			l.add(i);
		}
		
		long start;
		long end;
		
		start = System.currentTimeMillis();
		Iterator<Integer> ito = l.iterator();
		while(ito.hasNext()) {
			ito.next();
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList Iterate by Iterator: " + (end - start));
		
		start = System.currentTimeMillis();
		for(int i = 0; i < l.size(); i ++) {
			l.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList Iterate by RandomAccess: " + (end - start));
		
		start = System.currentTimeMillis();
		for(Integer i : l) {
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList Iterate by For: " + (end - start));
	}
}
