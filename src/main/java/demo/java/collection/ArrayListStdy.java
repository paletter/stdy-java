package demo.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStdy {

	public static void testInsertOneElementByEnsureCapacity(int num) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		System.out.println("Start ArrayList Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			l.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End ArrayList Insert! Result(Not EnsureCapacity): " + (end - start));
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l2.ensureCapacity(num);
		
		System.out.println("Start ArrayList Insert...");
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			l2.add(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("End ArrayList Insert! Result(EnsureCapacity): " + (end2 - start2));
		System.out.println("================================================");
	}
	
	public static void testInsertElementInLast(int num) {
		List<Integer> l = new ArrayList<Integer>();
		
		System.out.println("Start ArrayList Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			l.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End ArrayList Insert! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testInsertElementInFirst(int num) {
		List<Integer> l = new ArrayList<Integer>();
		
		System.out.println("Start ArrayList Insert...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < num; i ++) {
			l.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End ArrayList Insert! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testRemoveByObj() {
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0; i < 400000; i ++) {
			l.add(i);
		}
		
		System.out.println("Start ArrayList Remove...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i ++) {
			l.remove(Integer.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("End Arrayli Remove! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testRemoveByIndex() {
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0; i < 40000; i ++) {
			l.add(i);
		}
		
		System.out.println("Start ArrayList Remove...");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 20000; i ++) {
			l.remove(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("End Arrayli Remove! Result: " + (end - start));
		System.out.println("================================================");
	}
	
	public static void testIterate() {
		List<Integer> l = new ArrayList<Integer>();
		
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
		System.out.println("ArrayList Iterate by Iterator: " + (end - start));
		
		start = System.currentTimeMillis();
		for(int i = 0; i < l.size(); i ++) {
			l.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList Iterate by RandomAccess: " + (end - start));
		
		start = System.currentTimeMillis();
		for(Integer i : l) {
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList Iterate by For: " + (end - start));
	}
}
