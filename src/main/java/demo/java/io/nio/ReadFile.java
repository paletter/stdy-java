package demo.java.io.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream is = new FileInputStream("E:\\test.txt");
		FileChannel channel = is.getChannel();
		
		ByteBuffer bb = ByteBuffer.allocate(128);
		
		channel.read(bb);
		System.out.write(bb.array());
		
		System.out.println();
		System.out.println("Second Read!");
		
		channel.read(bb);
		System.out.write(bb.array());
	}
}
