package demo.java.junit.junit4.base;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 * Suite Runner:
 * 打包测试运行器。可以将多个测试用例同时运行测试
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalculatorBaseTest.class,
	CalculatorParamTest.class
})
public class CalculatorSuiteTest {

}
