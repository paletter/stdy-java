package demo.java.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStdy {

	public static void testInsertOrder() {
		Set<String> s = new TreeSet<String>();
		
		for(int i = 0; i < 100; i ++) {
			s.add(i + "");
		}
		
		System.out.println("TreeSet content(String):");
		System.out.println(s);
		
		Set<Integer> s2 = new TreeSet<Integer>();
		
		for(int i = 100; i >= 0; i --) {
			s2.add(i);
		}
		
		System.out.println("TreeSet content(Integer):");
		System.out.println(s2);
	}
	
	public static void testInsertElementInLast(int num) {
		Set<Integer> s = new TreeSet<Integer>();
		
		System.out.println("Start TreeSet Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			s.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End TreeSet Insert! Result: " + (end - start));
		System.out.println("================================================");
	}

	public static void testIterate() {
		Set<Integer> l = new TreeSet<Integer>();
		
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
		System.out.println("TreeSet Iterate by Iterator: " + (end - start));
		
		start = System.currentTimeMillis();
		for(Integer i : l) {
		}
		end = System.currentTimeMillis();
		System.out.println("TreeSet Iterate by For: " + (end - start));
	}
}
