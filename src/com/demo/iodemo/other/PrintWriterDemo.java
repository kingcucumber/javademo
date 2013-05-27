package com.demo.iodemo.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
	
		String line = null;
		while((line = bufr.readLine())!=null){
			if("over".equals(line))
			break;
			out.println(line.toUpperCase());
			out.flush();
		}
		out.close();
		bufr.close();
	}

}
