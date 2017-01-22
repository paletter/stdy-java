package demo.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetStdy {

	public static void testInsertOrder() {
		Set<String> s = new HashSet<String>();
		
		for(int i = 0; i < 100; i ++) {
			s.add(i + "");
		}
		
		System.out.println("HashSet content:");
		System.out.println(s);
	}
	
	public static void testInsertElement(int num) {
		Set<Integer> s = new HashSet<Integer>();
		
		System.out.println("Start HashSet Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			s.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End HashSet Insert! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testIterate() {
		Set<Integer> l = new HashSet<Integer>();
		
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
		System.out.println("HashSet Iterate by Iterator: " + (end - start));
		
		start = System.currentTimeMillis();
		for(Integer i : l) {
		}
		end = System.currentTimeMillis();
		System.out.println("HashSet Iterate by For: " + (end - start));
	}
}
