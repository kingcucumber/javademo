package com.demo.reflectionDemo;

import java.io.InputStream;
import java.util.List;

public class Person {
	public String name = "Create Object done";
	private int password;
	private static int age;
	
	public Person(){
		System.out.println("Person");
	}
	
	public Person(String str){
		System.out.println("Person str");
	}
	
	public Person(String name,String passwd){
		System.out.println("Person name passwd");
	}
	
	private Person(List list){
		System.out.println("Person list");
	}
	
	public void aa(){
		System.out.println("aa");
	}
	
	public void bb(String name,int password){
		System.out.println(name +":" + password);
	}
	
//	public Class[] cc(String name ,int[] password){
//		return new Class[](String.class);
//	}
	
	private void aa1(InputStream in ){
		System.out.println(in);
	}
	
	public static void bb1(int num){
		System.out.println(num);
	}
	public static void main(String [] args){
		System.out.println("hello");
	}
}
