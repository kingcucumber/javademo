package com.demo.iodemo.other;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream out = new PrintStream("print.txt");
		
		out.write(587);
	
		out.close();
	}

}
