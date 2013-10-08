package com.demo.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
//		test3();
	}

	private static void test3() {
		// TODO Auto-generated method stub
		Boolean res1 = Pattern.matches("\\d{6}","a124214");
		Boolean res2 = Pattern.matches("\\d{6}","124214");
		System.out.println(res1);
		System.out.println(res2);
	}

	private static void test2() {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\d{4}-\\d{1}-\\d{2}");
		String string = "2013-9-16 2013-9-17";
		Matcher match = pattern.matcher(string);
		
		while(match.find()){
			System.out.println(match.group(0));
		}
	}

	public static void test1() {
		String qq = "1234567890";
		
		String regex = "[1-9][0-9]{4,14}";
		boolean b = qq.matches(regex);
		
		System.out.println(qq + ":" + b);
	}

}
