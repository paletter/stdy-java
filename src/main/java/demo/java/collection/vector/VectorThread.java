package demo.java.collection.vector;

import java.util.Vector;

public class VectorThread extends Thread {

	Vector<Integer> v;

	public VectorThread(Vector<Integer> v) {
		super();
		this.v = v;
	}

	@Override
	public void run() {
		super.run();
		
		while(true) {
			v.add(1);
		}
	}

}
