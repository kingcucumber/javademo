package com.demo.threadsdemo;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo1 =new Demo("abcd");
		Demo demo2 = new Demo("1243");
		demo1.start();
		demo2.start();
		System.out.println(Thread.currentThread().getName());
	}

}

class Demo extends Thread{
	private String name;
	Demo(String name){
		this.name =name;
	}
	@Override
	public void run() {
		for(int x = 0;x<10;x++){
			for(int y=0;y<9999999;y++){
			}
			System.out.println(name + "..........." + x + getName());
		}
	}
}

