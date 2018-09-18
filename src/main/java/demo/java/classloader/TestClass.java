package demo.java.classloader;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestClass {

	public static void main(String[] args) {
		
		Lock l = new ReentrantLock();
		l.lock();
		l.unlock();
	}
}
