package com.demo.iodemo.charstream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr  = new FileReader("buf.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		String line = null;
		while((line = lnr.readLine())!= null){
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		
	}

}
