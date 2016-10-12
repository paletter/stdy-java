package demo.java.annotation.intercept;

public class InterTester {

	@InterMethodAnno
	public void methodWithAnno() {
		System.out.println("Execute InterTester.methodWithAnno");
	}
	
	public void methodWithoutAnno() {
		
	}
}
