package demo.java.junit.junit4.mock.test;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import demo.java.junit.junit4.mock.IMessageService;
import demo.java.junit.junit4.mock.IUserService;
import demo.java.junit.junit4.mock.NotifyController;

/**
 * 
 * 需静态导入org.mockito.Mockito下面的文件：
 * import static org.mockito.Mockito.*;
 * 否则无法使用mock(class)这类的命令
 * 
 * 或者用Mockito.mock(class) Mockito.when 等命令
 */
public class NotifyControllerTest {

	private NotifyController notifyController;
	private IUserService userService;
	private IMessageService messageService;
	
	@Before
	public void setUp() {
		notifyController = new NotifyController();
		userService = mock(IUserService.class);
		messageService = mock(IMessageService.class);
		
		notifyController.setUserService(userService);
		notifyController.setMessageService(messageService);
	}
	
	@Test
	public void testSendMessage() {
		String userId = "xxxxx";
		String email = "xxx@163.com";
		
		when(userService.getEmail(userId)).thenReturn(email);
		
		notifyController.sendMessage(userId, "Hello");
		
		verify(messageService).sendEmail(eq(email), eq("Hello"));
	}
}
