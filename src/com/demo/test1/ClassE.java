package com.demo.test1;

public class ClassE extends ClassA{
	public void method(){
		ClassA a = new ClassA();
		a.var1 = 1;
		a.var2 = 2;
		a.var3 = 3;
	}
	
	public static void main(String[]args){
		ClassE e = new ClassE();
		e.var1 = 1;
		e.var2 = 3;
		e.var3 = 2;
		e.setVar4(6);
		System.out.println(e.getVar4());
		
	}
}
