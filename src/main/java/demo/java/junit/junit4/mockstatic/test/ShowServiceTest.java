package demo.java.junit.junit4.mockstatic.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import demo.java.junit.junit4.mockstatic.CommonStaticUtil;
import demo.java.junit.junit4.mockstatic.ShowService;

@RunWith(PowerMockRunner.class)
@PrepareForTest({CommonStaticUtil.class})
public class ShowServiceTest {

	@Test
	public void testShowStr() {
		PowerMockito.mockStatic(CommonStaticUtil.class);
		PowerMockito.when(CommonStaticUtil.show()).thenReturn("mockshow");
		
		ShowService showService = new ShowService();
		Assert.assertEquals(showService.showStr(), "mockshow");
	}
}
