package demo.java.annotation.base;

public class BaseTester {

	@BaseMethodAnno
	public void methodWithAnno() {
		
	}
	
	@BaseMethodWithArgAnno(arg1="Arg1")
	public void methodWithArgAnno() {
		
	}
	
	public void methodWithoutAnno() {
		
	}
}
