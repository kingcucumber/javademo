package com.demo.nioDemo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class MappedByteBufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int capacity = 0x800000;
		MappedByteBuffer mbb = new RandomAccessFile("filechanneltest.txt", "rw")
				.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, capacity);
		
		mbb.put("你好啊,".getBytes("UTF-8"));
	
//		mbb.flip();
//		mbb.rewind();
		mbb.clear();
		System.out.println(Charset.forName("UTF-8").decode(mbb));
		
		
	}

}
