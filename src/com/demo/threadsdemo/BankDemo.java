package com.demo.threadsdemo;

public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cus c = new Cus();
		Thread t1  = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}

class Bank{
	private int sum;
	public void add(int num){
		sum = sum + num;
		System.out.println("sum = " + sum);
	}
}

class Cus implements Runnable{
	private Bank b =new Bank();
	@Override
	public void run() {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (b) {
			
			for(int i = 0; i<3;i++){
				b.add(100);
			}
		}
	}
	
}