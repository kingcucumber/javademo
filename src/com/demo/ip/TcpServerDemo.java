package com.demo.ip;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket ss = new ServerSocket(10000);
		System.out.println("server...........");
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostName();
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println("server:" + ip + ":" +text);
		
		OutputStream out = s.getOutputStream();
		out.write("收到".getBytes());
		
		
		
		s.close();
		ss.close();
		
	}

}
