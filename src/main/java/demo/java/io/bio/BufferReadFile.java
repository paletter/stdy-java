package demo.java.io.bio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferReadFile {

	public static void main(String[] args) throws Exception {
		
		// BufferedInputStream default buffer size: 8kb
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\test.txt"));
		
		byte[] b = new byte[1024];
		while(bis.read(b) != -1) {
			System.out.write(b);
		}
		
		System.out.println();
		System.out.println("Second Read!");
		
		while(bis.read(b) != -1) {
			System.out.write(b);
		}
	}
}
