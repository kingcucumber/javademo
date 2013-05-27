package com.demo.ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpSendDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		System.out.println("send .........");
		String str = "udp 传输: coming";
		
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getLocalHost(),2222);
		
		ds.send(dp);
		ds.close();
		
	}

}
