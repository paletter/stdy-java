package demo.java.jcraft;

public class Main {

	public static void main(String[] args) throws Exception {
		
		SFTPUtil sftp = new SFTPUtil("webadmin", "D:/03.WorkFiles/01.������Ϣ���/��������¼˽Կ/MyWorkbenchSSHKey", "123456", "118.178.142.20", 22);
//		sftp.connect();
//		sftp.upload("/home/webadmin/nginxroot", "test.txt", "E:/test.txt");
		sftp.download("/home/webadmin/nginxroot", "test.txt", "E:/test.txt");
	}
}
