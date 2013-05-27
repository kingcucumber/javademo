package com.demo.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = null;
		ip = InetAddress.getByName("baidu.com");
		InetAddress[] ips = InetAddress.getAllByName("www.baidu.com");
		for(InetAddress p: ips){
			System.out.println(p.getHostAddress());
		}
		
	/*	System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());*/
	}

}
