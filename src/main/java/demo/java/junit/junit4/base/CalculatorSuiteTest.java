package demo.java.junit.junit4.base;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 * Suite Runner:
 * ������������������Խ������������ͬʱ���в���
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalculatorBaseTest.class,
	CalculatorParamTest.class
})
public class CalculatorSuiteTest {

}
