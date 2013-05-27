package com.demo.iodemo.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeDemo();
		
		//readDemo();
		FileInputStream fis  = new FileInputStream("byte.txt");
		byte[] b = null;
		int len = 0;
		while((len = fis.read())!= -1){
			System.out.println((char)len);
		}
		
	}

	public static void readDemo() throws IOException {
		FileInputStream fis  = new FileInputStream("byte.txt");
		byte b = 0;
		while((b=(byte) fis.read()) != -1){
			System.out.print((char)b);
		}
		fis.close();
	}

	public static void writeDemo() throws IOException {
		FileOutputStream fos = new FileOutputStream("byte.txt");
		fos.write("abcdefadsfe".getBytes());
		
		fos.close();
	}

}
