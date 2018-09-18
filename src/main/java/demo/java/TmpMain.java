package demo.java;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TmpMain {

	
	public static void main(String[] args) {
		
		List<TestModel> l = new ArrayList<TestModel>();
		
		TestModel m;
		for (int i = 0; i < 10; i ++) {
			m = new TestModel();
			l.add(m);
		}
		
		while(true) {}
	}
	
}
