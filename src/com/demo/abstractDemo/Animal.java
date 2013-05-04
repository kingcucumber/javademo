package com.demo.abstractDemo;

public abstract class Animal {

	private String gender;
	
	protected int num = 1;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public abstract void info();
	public void test(){
		System.out.println("test in animal!");
	}
}
