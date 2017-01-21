package demo.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
