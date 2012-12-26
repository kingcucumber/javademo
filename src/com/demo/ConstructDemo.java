package com.demo;

public class ConstructDemo {

	public ConstructDemo(){
		System.out.println("the constructdemo execute!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the main function before!");
		ConstructDemo c = new ConstructDemo();
		System.out.println("the main function after");
	}

}
