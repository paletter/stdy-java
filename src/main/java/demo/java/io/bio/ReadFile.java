package demo.java.io.bio;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("E:\\test.txt");
		
		byte[] b = new byte[1];
		int i = 0;
		while(is.read(b) != -1) {
			System.out.println("I/O Read Count: ========================================================" + i);
			System.out.write(b);
			i ++;
		}
		
		System.out.println("Second Read!");
		
		while(is.read(b) != -1) {
			System.out.println("I/O Read Count: ========================================================" + i);
			System.out.write(b);
			i ++;
		}
	}
}
