package demo.java.jcraft;

import com.jcraft.jsch.Logger;

public class JSchLogger implements Logger {

	@Override
	public boolean isEnabled(int arg0) {
		return true;
	}

	@Override
	public void log(int arg0, String msg) {
		System.out.println(msg);
	}
	
}
