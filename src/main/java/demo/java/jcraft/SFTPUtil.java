package demo.java.jcraft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Logger;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

public class SFTPUtil {

	private String userName;
	private String pwd;
	private String host;
	private int port;
	
	private String keyFilePath;
	private String keyPwd;
	
	private Session session;
	private ChannelSftp sftp;

	/**
	 * 构建基于密码认证的sftp对象
	 * @param userName
	 * @param pwd
	 * @param host
	 * @param port
	 */
	public SFTPUtil(String userName, String pwd, String host, int port) {
		this.userName = userName;
		this.pwd = pwd;
		this.host = host;
		this.port = port;
	}

	/**
	 * 构建基于秘钥认证的sftp对象
	 * @param userName
	 * @param pwd
	 * @param keyFilePath
	 * @param host
	 * @param port
	 */
	public SFTPUtil(String userName, String keyFilePath, String keyPwd, String host, int port) {
		this.userName = userName;
		this.keyPwd = keyPwd;
		this.keyFilePath = keyFilePath;
		this.host = host;
		this.port = port;
	}
	
	/**
	 * 链接服务器
	 * @throws Exception
	 */
	public void connect() throws Exception {
		
		try {
			
			JSch jSch = new JSch();
			
			if(keyFilePath != null) {
				jSch.addIdentity(keyFilePath, keyPwd);
			}
			
			session = jSch.getSession(userName, host, port);
			if(pwd != null) {
				session.setPassword(pwd);
			}
			
			Properties config = new Properties();
			config.put("StrictHostKeyChecking", "no");
			config.put("userauth.gssapi-with-mic", "no");
			session.setConfig(config);
			
//			Logger jSchLogger = new JSchLogger();
//			JSch.setLogger(jSchLogger);
			
			session.connect();
			System.out.println("Session connect");
			
			Channel channel = session.openChannel("sftp");
			channel.connect();
			
			sftp = (ChannelSftp) channel;
			System.out.println("ChannelSftp connect");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void upload(String targetDir, String targetFileName, String origFilePath) {
		try {
			
			connect();
			
			try {
				sftp.cd(targetDir);
			} catch (Exception e) {
				sftp.mkdir(targetDir);
				sftp.cd(targetDir);
			}
			
			InputStream is = new FileInputStream(origFilePath);
			sftp.put(is, targetFileName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void download(String targetDir, String targetFileName, String origFilePath) {
		try {
			
			connect();
			
			sftp.cd(targetDir);
			
			File file = new File(origFilePath);
			sftp.get(targetFileName, new FileOutputStream(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		if(sftp != null) {
			if(sftp.isConnected()) {
				sftp.disconnect();
				session.disconnect();
			}
		}
	}
	
}
