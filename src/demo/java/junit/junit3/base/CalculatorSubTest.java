package demo.java.junit.junit3.base;

import junit.framework.TestCase;
import demo.java.junit.Calculator;

public class CalculatorSubTest extends TestCase {

	public CalculatorSubTest() {
		super();
	}
	
	/**
	 * �����������������������Ҫ���õĲ��Է���
	 * ������TestSuite.addTest
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
	 * ��test��ͷ�ķ������Զ���Ϊ���Է���
	 * �������Ʊ�����test��ͷ��û�в������޷���ֵ���ǹ����ģ������׳��쳣
	 */
	public void testSub() {
		System.out.println("TestSub");
		Calculator.sub(1);
		assertEquals(-1, Calculator.result);
	}
}
