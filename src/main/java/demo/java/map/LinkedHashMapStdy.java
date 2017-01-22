package demo.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapStdy {

	public static void testInsertOrder() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		
		for(int i = 0; i < 100; i ++) {
			m.put(i + "", i + "");
		}
		
		System.out.println("LinkedHashMap content:");
		System.out.println(m);
	}
}
