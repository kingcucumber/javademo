package com.demo.classdemo;

import java.io.IOException;

public class RuntimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		try {
			System.out.println("available processors:" + rt.availableProcessors());
			System.out.println("free memory:" + rt.freeMemory());
			Process p = rt.exec("notepad.exe");
			p.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
