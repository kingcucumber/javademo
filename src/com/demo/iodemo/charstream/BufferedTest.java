package com.demo.iodemo.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr  = new FileReader("buf.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("buf_copy2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		/*int ch = 0;
		while((ch=br.read())!=-1){
			bw.write(ch);
		}*/
		
		String line = null;
		while((line = br.readLine())!= null){
			bw.write(line);
		}
		
		br.close();
		bw.close();
		
	}

}
