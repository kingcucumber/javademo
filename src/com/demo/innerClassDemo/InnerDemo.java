package com.demo.innerClassDemo;

public class InnerDemo {
	public static  void main(String[]args){
		Outer.Inner in = new Outer.Inner();
		in.show();
		Outer out = new Outer();
		out.method();
	}
}

class Outer{
private static int num = 3;
	
	static class Inner{
		void show(){
			System.out.println("show num ...."+ num	);
		}
	}
	
	public void method(){
		Inner inner = new Inner();
		inner.show();
	}
}