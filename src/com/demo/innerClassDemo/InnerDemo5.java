package com.demo.innerClassDemo;

public class InnerDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4 out = new Outer4();
		out.method();
	}
}

abstract class Demo
{
	abstract void show();
}
class Outer4{
	int  num = 4;
	/*class Inner extends Demo {
		void show(){
			System.out.println("show .... " + num);
		}
	}*/
	
	public void method(){
	//	new Inner().show();
		new Demo(){
			void show(){
				System.out.println("abstract show");
			}
		}.show();
	}
}
