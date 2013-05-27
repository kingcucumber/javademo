package com.demo.util.genericdemo;

public class Student {
	private String name;
	private int age;
	private int no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int no) {
		super();
		this.name = name;
		this.age = age;
		this.no = no;
	}
	
	

}
