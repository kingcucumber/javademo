package com.demo.iodemo.other;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeData();
		readData();
	}

	private static void readData() throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis  = new DataInputStream(new FileInputStream("data.txt"));
		
		String data = dis.readUTF();
		System.out.println(data);
	}

	private static void writeData() throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
		
		dos.writeUTF("你好");
		dos.close();
	}

}
