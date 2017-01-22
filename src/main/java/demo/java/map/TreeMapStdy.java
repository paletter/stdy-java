package demo.java.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStdy {

	public static void testInsertOrder() {
		Map<String, String> m = new TreeMap<String, String>();
		
		for(int i = 0; i < 100; i ++) {
			m.put(i + "", i + "");
		}
		
		System.out.println("TreeMap content(String):");
		System.out.println(m);
		
		Map<Integer, String> m2 = new TreeMap<Integer, String>();
		
		for(int i = 0; i < 100; i ++) {
			m2.put(i, i + "");
		}
		
		System.out.println("TreeMap content(Integer):");
		System.out.println(m2);
	}
}
