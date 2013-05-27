package com.demo.innerClassDemo;

public class InnerDemo4 {
	public static void main(String[]args){
		Object obj = new Outer3().method();
		
	}
}

class Outer3{
	int num = 3;
	Object method(){
		final int x = 9;
		
		class Inner{
			void show(){
				System.out.println("show ......" + x);
			}
		}
		Object in = new Inner();
		return in;
	}
}