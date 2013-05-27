package com.demo.iodemo.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// copy1();
		//copy2();
		copy3();
	}

	public static void copy3() throws IOException {
		FileInputStream fis = new FileInputStream("Kalimba.mp3");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("test2.mp3");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		fos.write(buf);
		fos.close();
		fis.close();
	}

	public static void copy2() throws IOException {
		FileInputStream fis = new FileInputStream("Kalimba.mp3");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("testbuf.mp3");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] buf = new byte[1204];
		int len = 0;
		while ((len = bis.read(buf)) != -1) {
			bos.write(buf, 0, len);
		}
		fos.close();
		fis.close();

	}

	public static void copy1() throws IOException {
		FileInputStream fis = new FileInputStream("Kalimba.mp3");

		FileOutputStream fos = new FileOutputStream("test.mp3");

		byte[] buf = new byte[1204];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		fos.close();
		fis.close();

	}

}
