package demo.java.junit.junit3.base;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorSuiteTest extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new CalculatorAddTest("testAdd"));
		suite.addTest(new CalculatorSubTest("testSub"));
		return suite;
	}
}
