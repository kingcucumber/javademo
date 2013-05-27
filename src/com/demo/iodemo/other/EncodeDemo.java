package com.demo.iodemo.other;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		demo1();
	}

	public static void demo1() throws UnsupportedEncodingException {
		String str = "你好";
		byte[] buf  = str.getBytes("GBK");
		printBytes(buf);
		String s = new String(buf,"UTF-8");
		System.out.println(s);
	}

	private static void printBytes(byte[] buf) {
		// TODO Auto-generated method stub
		for(byte b: buf){
			System.out.print( " " + b);
		}
		System.out.println();
	}

}
