package demo.java.junit;

public class Calculator {

	public static int result = 0;

	public static void init() {
		result = 0;
	}
	
	public static void add(int n) {
		result = result + n;
	}
	
	public static void sub(int n) {
		result = result - n;
	}
	
}
