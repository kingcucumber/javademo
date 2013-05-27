package com.demo.iodemo.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("filewriter.txt");
		int ch;
		while((ch = fr.read())!= -1){
			System.out.print((char)ch);
		}
	}

}
