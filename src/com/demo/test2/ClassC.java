package com.demo.test2;

import com.demo.test1.ClassA;

public class ClassC extends ClassA{
	
	public void method(){
		ClassA a = new ClassA();
		a.var1 = 2;
	}
	
	public static void main(String []args){
		ClassC c = new ClassC();
		c.var1 = 1;
		c.var2 = 2;
	}
}
