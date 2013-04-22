package com.demo.test1;

public class ClassA {
	public int var1;
	protected int var2;
	int var3;
	private int var4;
	
	public void method(){
		var1 = 1;
		var2 = 2;
		var3 = 3;
		var4 = 4;
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();

		a.var1 = 10;
		a.var2 = 20;
		a.var3 = 30;
		a.var4 = 40;
	}
	
	public int getVar4(){
		return var4;
	}
	
	public void setVar4(int var){
		this.var4 = var;
	}
}
