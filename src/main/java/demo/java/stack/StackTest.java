package demo.java.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}
}
