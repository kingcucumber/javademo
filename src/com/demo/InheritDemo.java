package com.demo;

public class InheritDemo {
	public static void main(String[]args){
		Zi zi = new Zi();
		zi.show();
	}
}


class Fu{
	Fu(){
		super();
		show(); //该处的父类调用的show方法，在该程序中其实是子类的show方法，而不是父类的show
		return;
	}
	void show(){
		System.out.println("fu show!");
	}
}

class Zi extends Fu{
	int num = 8;
	Zi(){
		super();
		return;
	}
	void show(){
		System.out.println("Zi show " + num);
	}
}