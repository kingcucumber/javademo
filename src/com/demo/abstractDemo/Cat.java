package com.demo.abstractDemo;

public class Cat extends Animal {

	public int num = 2;
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("i'm a " + this.getGender() + " cat!");
	}
	public Cat(String gender){
		this.setGender(gender);
	}
	
	public void show(){
		System.out.println("super's gender is:" + super.getGender());
	}
	
	public void test(){
		System.out.println("test in cat!");
	}
}
