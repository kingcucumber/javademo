package com.demo.classdemo;

public class WrapperDemo {
	public static void main(String[] args){
		/*System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);*/
		
		
		char c1 = '3';
		Character ch = new Character(c1);
//		System.out.println(ch);
		String c = "23";
		Byte a = new Byte(c);
		Byte b = new Byte(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
