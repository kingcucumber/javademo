package com.demo.iodemo.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("buf.txt");
	/*	fw.write("safasasfdas");
		fw.close();*/
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.append("asfdadsf;lasjf;ldsakjf;ladsj;asfj;lksajdf;lkasdj");
		bw.close();
		fw.close();
	}

}
