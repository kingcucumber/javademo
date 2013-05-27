package com.demo.iodemo.charstream;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	
	private FileReader r;
	
	private char[] buf = new char[1024];
	private int pos = 0;
	private int count = 0;
	
	public MyBufferedReader(FileReader r) {
		super();
		this.r = r;
	}

	public int myRead() throws IOException{

		if(count == 0){
			count = r.read(buf);
			pos = 0;
		}
		if(count < 0) return -1;
		char ch = buf[pos];
		pos++;
		count--;
		return ch;
	}
	
	public String myReadLine() throws IOException{
		StringBuilder  sb = new StringBuilder();
		char enter = '\r';
		int ch = 0;
		while((ch = myRead()) != -1){
			if(ch == '\r')
				continue;
			if(ch ==  '\n')
				return sb.toString();
			sb.append(ch);
		}
		return sb.toString();
	}
}
