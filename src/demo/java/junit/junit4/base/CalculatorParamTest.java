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
 * 运行器。若想要指定一个Runner，需要用@RunWith标注，并将所指定的运行器作为参数传递给它
 * 默认的运行器是@RunWith(TestClassRunner.class)
 * 
 * Parameterized Runner：
 * 参数化测试运行器。可以用多个参数运行重复测试同一个测试用例，注释方法@RunWith(Parameterized.class)
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
