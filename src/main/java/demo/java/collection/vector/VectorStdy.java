package demo.java.collection.vector;

import java.util.Vector;

public class VectorStdy {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		VectorThread t1 = new VectorThread(v);
		t1.start();
		
		VectorThread t2 = new VectorThread(v);
		t2.start();
		
		System.out.println(v);
	}
}
