package com.demo.ip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.InputStream;

public class TranClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Socket s  = new Socket("localhost", 10000);
		
		OutputStream out = s.getOutputStream();
		
		BufferedInputStream bis = new BufferedInputStream(System.in);
		
		BufferedOutputStream bos = new BufferedOutputStream(out);
		
		
		InputStream in = (InputStream) s.getInputStream();

		int line = 0;
		while((line = bis.read() )!= -1){
			System.out.println(line);
		}
		s.close();
		
		
	}

}
