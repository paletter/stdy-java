package demo.java.junit.junit4.base;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import demo.java.junit.Calculator;

public class CalculatorBaseTest {

	/**
	 * @Before 在任何一个测试执行之前必须执行的代码
	 */
	@Before
	public void preTest() {
		System.out.println("** preTest");
		Calculator.init();
	}
	
	@Test
	public void testAdd() {
		System.out.println("TestAdd");
		Calculator.add(1);
		assertEquals(1, Calculator.result);
	}

	@Test
	public void testSub() {
		System.out.println("TestSub");
		Calculator.sub(1);
		assertEquals(-1, Calculator.result);
	}

}
