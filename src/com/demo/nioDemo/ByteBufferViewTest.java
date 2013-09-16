package com.demo.nioDemo;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class ByteBufferViewTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(64);
		for(int i=0;i<4;i++){
			bb.put((byte)i);
		}
		bb.flip();
		while(bb.hasRemaining()){
			System.out.println(bb.get());
		}
		bb.rewind();
		
		CharBuffer cb = bb.asCharBuffer();
		cb.put("你好");
		while(bb.hasRemaining()){
			System.out.println(bb.getChar());
		}
		
		bb.clear();
		IntBuffer ib = bb.asIntBuffer();
		ib.put(new int[]{11,23,45,67,89});
		System.out.println(ib.get(3));
		System.out.println(ib.position());
		ib.put(3,500);
		System.out.println(ib.get(3));
		System.out.println(ib.position());
		
	}

}
