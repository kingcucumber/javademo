package com.demo.nioDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteBufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int BSIZE = 1024;
		FileChannel in = new FileInputStream("filechanneltest.txt").getChannel();
		FileChannel out = new FileOutputStream("filechannelout.txt").getChannel();
		
		/*ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		
		while(in.read(buffer)!= -1){
			buffer.flip();
			out.write(buffer);
			buffer.clear();			
		}*/
		
		in.transferTo(0,in.size(),out);
		
		//out.transferFrom(in,0,in.size());
		
		in.close();
		out.close();
	}

}
