package com.demo.iodemo.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fs = null;
		try {
			fs = new FileWriter("filewriter", true);
			fs.write("append");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fs != null) {
				try {
					fs.close();
				} catch (IOException e) {
					// code......
					throw new RuntimeException();
				}
			}
		}

	}

}
