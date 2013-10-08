package com.demo.newThreadDemo;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 
 * a demo for semaphore 
 * @author jinhuawa
 *
 */
public class Bank {

	private final static int COUNT = 100;
	private final static Semaphore semaphore = new Semaphore(2,true);
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<COUNT ;i++){
			final int count = i;
			new Thread(){
				public void run(){
					try{
						// we use the function tryAcquire(), not acquire()
						if(semaphore.tryAcquire(10,TimeUnit.MILLISECONDS)){
							// customer is enjoying service, then leave , this period is (Math.random()*10)
							try{
								Teller.getSevice(count);
							}finally{
								semaphore.release();
							}
						}
					}catch(InterruptedException e){
						// this mean customer can't get service, leave directly.
					}
				}
			}.start();
		}
	}	

}

class Teller {
	static public void getSevice(int i){
		try{
			System.out.println("serving: "+ i);
			Thread.sleep((long)(Math.random()*10));
		}catch(InterruptedException e){
			
		}
	}
}
