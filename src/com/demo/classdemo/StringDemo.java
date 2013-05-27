package com.demo.classdemo;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String s1 = "abc";
		
		String s2= new String("abc");
		String s3 = new String("abc");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		System.out.println(s == s1); //true
		System.out.println(s.equals(s1)); //true
		System.out.println(s == s2);  //false
		System.out.println(s.equals(s2)); //true
		System.out.println(s == s3);  //false
		System.out.println(s.equals(s3));  //true
		System.out.println(s2 == s3);  //false
		System.out.println(s2.equals(s3));  //true
	}

}
