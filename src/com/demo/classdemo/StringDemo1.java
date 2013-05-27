package com.demo.classdemo;

public class StringDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	stringConstructDemo();
		String s  = "java";
		String s2 = s.replace("a", "o");
		System.out.println(s == s2);  //false
		System.out.println(s2);
		System.out.println(s);
 		
		String s3 = s.replace("t", "1");
		System.out.println(s == s3);  //true
		
		String s4 = "abc";
		String s5 = s4.intern();
		System.out.println(s4 == s5);
		
	}

	private static void stringConstructDemo() {
		String str = "asbddsfucksadfas";
		System.out.println("length:" +str.length()); //16
		System.out.println("char:" + str.charAt(2)); //b
		System.out.println("indexOf:" + str.indexOf('d')); //3
		System.out.println("lastIndexOf:" + str.lastIndexOf("fuck")); //6
	}

	
}
