package com.demo.iodemo.stdio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//copyFile2File();
		//copyKey2File();
//		copyFile2Out();
		copyKey2Out();
		
		
	}

	public static void copyKey2Out() {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		OutputStream os =  System.out;
		
		//////////////////
		
	}

	public static void copyFile2Out() throws IOException {
		
		FileReader fr = new FileReader("asfdsaf.txt");
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
	}

	public static void copyKey2File() throws IOException {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		FileWriter fw = new FileWriter("demo.txt");
		/////
		InputStreamReader isr = new InputStreamReader(System.in);
		
	}

	public static void copyFile2File() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String line = null;
		while((line = br.readLine()) !=null){
			bw.write(line);
		}
		
	}

}
