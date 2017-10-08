package demo.java.arithmetic;

public class Recursive {

	public static void main(String[] args) {
		
		System.out.println(f(10));
	}
	
	public static int f(int n) {
		if(n == 1) {
			return 10;
		} else {
			return f(n - 1) + 2;
		}
	}
}
