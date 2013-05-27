package com.demo.classdemo;

import java.util.Random;

public class MathDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = Math.ceil(12.234234d);
		double num2 = Math.floor(12.124123);
		double num3 = Math.round(21.5443);
		
	/*	System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);*/
		
		Random random = new Random();
		for(int i = 0;i<10;i++){
			System.out.println(random.nextInt(32));
		}
	}

}
