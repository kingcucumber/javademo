package com.demo.innerClassDemo;

public class InnerDemo2 {

	public static void main(String[] args) {
		//Outer1.Inner.show();
		Outer1 out = new Outer1();
		out.method();
		Outer1.Inner in = new Outer1().new Inner();
		in.show();
	}

}

class Outer1 {
	private static int num = 3;

	 class Inner {
		 void show() {
			System.out.println("show num ...." + num);
		}
	}

	public  void method() {
		Inner inner = new Inner();
		inner.show();
	}
}