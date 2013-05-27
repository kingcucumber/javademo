package com.demo.ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpRecvDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("recv ...........");
		DatagramSocket ds = new DatagramSocket(2222);

		while (true) {
			byte[] buf = new byte[1024];

			DatagramPacket dp = new DatagramPacket(buf, buf.length);

			ds.receive(dp);
			
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			String text = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip + ":" + port + " " + text);
			
		}
	}

}
