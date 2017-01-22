package demo.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapStdy {

	public static void testInsertOrder() {
		Map<String, String> m = new HashMap<String, String>();
		
		for(int i = 0; i < 100; i ++) {
			m.put(i + "", i + "");
		}
		
		System.out.println("HashMap content:");
		System.out.println(m);
	}
}
