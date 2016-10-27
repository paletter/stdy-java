package demo.java.junit.junit4.base;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import demo.java.junit.Calculator;

/**
 * 
 * Runner:
 * ������������Ҫָ��һ��Runner����Ҫ��@RunWith��ע��������ָ������������Ϊ�������ݸ���
 * Ĭ�ϵ���������@RunWith(TestClassRunner.class)
 * 
 * Parameterized Runner��
 * �����������������������ö�����������ظ�����ͬһ������������ע�ͷ���@RunWith(Parameterized.class)
 *
 */
@RunWith(Parameterized.class)
public class CalculatorParamTest {

	private int param;
	private int result;

	public CalculatorParamTest(int param, int result) {
		this.param = param;
		this.result = result;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {{0, 0}, {1, 0}, {1, 1}});
	}

	@Before
	public void preTest() {
		System.out.println("** preTest");
		Calculator.init();
	}
	
	@Test
	public void testAdd() {
		System.out.println("TestAdd");
		Calculator.add(param);
		assertEquals(result, Calculator.result);
	}
}
