package com.demo.iodemo.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter  fw = new FileWriter("filewriter.txt");
		
		fw.write("abcdef\nghijkl");
		fw.close();
	}

}
