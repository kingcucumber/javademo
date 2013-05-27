package com.demo.ip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TranServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket ss  = new ServerSocket(10000);
		
		Socket s = ss.accept();
		
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());

		int line = 0;
		while((line = bis.read()) != -1){
			System.out.println(line);
			System.out.println("upper");
		}
		
		ss.close();
	}

}
