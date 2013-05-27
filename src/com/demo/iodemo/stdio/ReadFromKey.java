package com.demo.iodemo.stdio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadFromKey {

	/**
	 * @param args
	 * @throws IOException
	 *             2
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * InputStream is= System.in; int ch = 0; while((ch=is.read())!= -1){
		 * System.out.print((char)ch); }
		 */
//		fn();
//		read1();
		read2();
	}

	public static void fn() throws IOException {
		InputStream in = System.in;
		StringBuilder sb = new StringBuilder();

		int ch = 0;
		while ((ch = in.read()) != -1) {
			if (ch == '\r')
				continue;
			if (ch == '\n') {
				String temp = sb.toString();
				if ("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			} else
				sb.append((char) ch);
		}
		System.out.println(sb.toString());
	}

	public static void read1() throws IOException{
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		
		BufferedReader  br = new BufferedReader(isr);
		String temp = null;
		while((temp = br.readLine()) !=null){
			System.out.println(temp);
		}
		
	}
	
	public static void read2() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
	}
}
