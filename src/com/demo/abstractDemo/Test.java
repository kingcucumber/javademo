package com.demo.abstractDemo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat("girl");
		System.out.println("animal's gender:" + cat.getGender());
		
		System.out.println("animal's num:" + cat.num);
		cat.info();
		cat.test();
		
		System.out.println("-------------------------");
		Cat c = new Cat("boy");
		c.info();
		c.test();
		System.out.println("cat's gender:" + c.getGender());
		
		System.out.println("-------------------------");
		Animal a = new Animal(){
			public void info(){
				System.out.println("i'm an animal!");
			}
		};
		a.info();
		a.test();
		
	}

}
