package com.demo.ip;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost",10000);
		System.out.println("client .............");
		OutputStream out = socket.getOutputStream();
		
		out.write("tcp 演示： coming!".getBytes());
		
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		System.out.println(in.toString());
		
		socket.close();
	}

}
