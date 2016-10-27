package demo.java.junit.junit4.mock;

public class NotifyController {

	private IUserService userService;
	private IMessageService messageService;
	
	public void sendMessage(String userId, String msg) {
		String email = userService.getEmail(userId);
		messageService.sendEmail(email, msg);
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}
	
}
