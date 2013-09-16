package com.demo.nioDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class FileChannelDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int SIZE = 1024;
		FileChannel fc = new FileOutputStream("filechanneltest.txt").getChannel();
		
		fc.write(ByteBuffer.wrap("你个SB，好好找工作".getBytes()));
		fc.close();
		
		fc = new RandomAccessFile("filechanneltest.txt","rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("朋友".getBytes()));
		fc.close();
		
		fc = new FileInputStream("filechanneltest.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(SIZE);
		fc.read(buff);
		buff.flip();
		Charset cs = Charset.defaultCharset();
		System.out.println(cs);
		System.out.println(cs.decode(buff));
		fc.close();
		
	}

}
