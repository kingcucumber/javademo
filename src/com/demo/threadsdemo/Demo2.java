package com.demo.threadsdemo;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 demo = new ThreadDemo2();
		Thread t = new Thread(demo);
		t.start();
	}

}

class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the second method implements multi threads!");
	}
	
}