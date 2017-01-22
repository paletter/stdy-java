package demo.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetStdy {

	public static void testInsertOrder() {
		Set<String> s = new LinkedHashSet<String>();
		
		for(int i = 0; i < 100; i ++) {
			s.add(i + "");
		}
		
		System.out.println("LinkedHashSet content:");
		System.out.println(s);
	}
	
	public static void testInsertElement(int num) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		
		System.out.println("Start LinkedHashSet Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			s.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End LinkedHashSet Insert! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testIterate() {
		Set<Integer> l = new LinkedHashSet<Integer>();
		
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
		System.out.println("LinkedHashSet Iterate by Iterator: " + (end - start));
		
		start = System.currentTimeMillis();
		for(Integer i : l) {
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedHashSet Iterate by For: " + (end - start));
	}
}
