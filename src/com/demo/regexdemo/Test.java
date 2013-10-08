package com.demo.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}

	private static void test4() {
		// TODO Auto-generated method stub
		//切分
		/*String regex = "\\s+";
		for(String s : "one\ttwo\n three".split(regex)){
			System.out.print(s + " ");
		}*/
		Pattern pattern = Pattern.compile("\\s+");
		for(String s : pattern.split("one\ttwo\n three"))
		System.out.print(s + " ");
	}

	private static void test3() {
		// TODO Auto-generated method stub
		//替换
		/*String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
		String repacement = "$2/$3/$1";
		String str = "2013-09-17 2013-09-18";
		System.out.println(str.replaceAll(regex, repacement));*/
		
		Pattern pattern = Pattern.compile("\\d+\\.\\d{0,2}");
		Matcher matcher = pattern.matcher("price is 12.99");
		System.out.println(matcher.replaceAll("\\$$0"));
	}

	private static void test2() {
		// TODO Auto-generated method stub
		//提取
	/*	Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
		Matcher matcher = pattern.matcher("2013-09-17 2013-09-18");
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}*/
		
		Pattern pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
		Matcher matcher = pattern.matcher("2013-09-17 2013-09-18");
		/*while(matcher.find()){
			System.out.println("date:" + matcher.group(0));
			System.out.println("year:" + matcher.group(1));
			System.out.println("month:" + matcher.group(2));
			System.out.println("day:" + matcher.group(3));
		}*/
		while (matcher.find()) {
			for (int i = 0; i < matcher.groupCount(); i++) {
				System.out.println("date:" + matcher.group(i));
			}
		}
	}

	private static void test1() {
		// TODO Auto-generated method stub
		//验证
		/*boolean flag1 = "2013-09-17".matches("\\d{4}-\\d{2}-\\d{2}");
		boolean flag2 = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", "2013-09-17");
		System.out.println(flag1);
		System.out.println(flag2);*/
		
		Pattern pattern = Pattern.compile("\\A\\d{4}-\\d{2}-\\d{2}\\z");
		String s = "2013-09-17";
		Matcher matcher = pattern.matcher(s);
		boolean flag = matcher.find();
		System.out.println(flag);
	}

}
