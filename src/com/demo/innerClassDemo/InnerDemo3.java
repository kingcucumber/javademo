package com.demo.innerClassDemo;

public class InnerDemo3 {
 public static void main(String[]args){
	 new Outer2().method();
 }
}

class Outer2{
	int num = 3;
	class Inner{
		int num = 4;
		void show(){
			int num = 5;
			System.out.println(Outer2.this.num);
		}
	}
	void method(){
		new Inner().show();
	}
}
