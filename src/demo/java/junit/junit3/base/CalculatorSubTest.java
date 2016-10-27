package demo.java.junit.junit3.base;

import junit.framework.TestCase;
import demo.java.junit.Calculator;

public class CalculatorSubTest extends TestCase {

	public CalculatorSubTest() {
		super();
	}
	
	/**
	 * 传入测试用例方法名来运行要调用的测试方法
	 * 可用于TestSuite.addTest
	 */
	public CalculatorSubTest(String testMethodName) {
		super(testMethodName);
	}
	
	@Override
	protected void setUp() throws Exception {
		System.out.println("SetUp");
		Calculator.init();
	}

	@Override
	protected void tearDown() throws Exception {
		System.out.println("TearDown");
	}

	/**
	 * 以test开头的方法会自动作为测试方法
	 * 方法名称必须以test开头，没有参数，无返回值，是公开的，可以抛出异常
	 */
	public void testSub() {
		System.out.println("TestSub");
		Calculator.sub(1);
		assertEquals(-1, Calculator.result);
	}
}
