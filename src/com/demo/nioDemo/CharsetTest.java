package com.demo.nioDemo;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class CharsetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		final int BSIZE	= 1024;
		
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		CharBuffer cb = bb.asCharBuffer();
		System.out.println(cb);
		
		
		//bb = ByteBuffer.wrap("你好".getBytes("UTF-16BE"));
		bb = ByteBuffer.wrap("你好".getBytes("UNICODE")); // use the system default charset
		cb = bb.asCharBuffer();    // change to unicode charset.
		System.out.println(cb);
		
		bb= ByteBuffer.wrap("你好".getBytes("UTF-8"));
		Charset cs = Charset.forName("UTF-8");
		cb = cs.decode(bb);
		System.out.println(cb);
		
		cs = Charset.forName("GBK");
		bb = cs.encode("你好");
		cb = cs.decode(bb);
		System.out.println(cb);
		for(int i = 0;i<cb.limit();i++){
			System.out.println(cb.get());
		}
	}

}
