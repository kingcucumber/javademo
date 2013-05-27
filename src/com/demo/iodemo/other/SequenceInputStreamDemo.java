package com.demo.iodemo.other;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("2.txt"));
		v.add(new FileInputStream("3.txt"));
		Enumeration<FileInputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("4.txt");
		byte[] buf = new byte[2014];
		
		int len = 0;
		while((len = sis.read(buf))!=-1){
			fos.write(buf, 0, len);
			fos.write('\r');
		}
		fos.close();
		sis.close();
	}

}
