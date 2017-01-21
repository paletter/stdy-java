package demo.java.junit.junit3.base;

import junit.framework.TestCase;
import demo.java.junit.Calculator;

public class CalculatorAddTest extends TestCase {

	public CalculatorAddTest() {
		super();
	}
	
	/**
	 * �����������������������Ҫ���õĲ��Է���
	 * ������TestSuite.addTest
	 */
	public CalculatorAddTest(String testMethodName) {
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
	public void testAdd() {
		System.out.println("TestAdd");
		Calculator.add(1);
		assertEquals(1, Calculator.result);
	}
}
