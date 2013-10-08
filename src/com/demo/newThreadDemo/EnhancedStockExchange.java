package com.demo.newThreadDemo;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 * a demo for countDownLatch
 * @author jinhuawa
 *
 */
public class EnhancedStockExchange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> orderQueue = new LinkedBlockingQueue<Integer>();
		CountDownLatch startSignal = new CountDownLatch(1);
		CountDownLatch stopSignal = new CountDownLatch(200);
		Sellerr seller = new Sellerr(orderQueue,startSignal,stopSignal);
		Thread[] sellerThread = new Thread[100];
		for(int i=0;i<100;i++){
			sellerThread[i] = new Thread(seller);
			sellerThread[i].start();
		}
		Buyerr buyer = new Buyerr(orderQueue,startSignal,stopSignal);
		Thread[] buyerThread = new Thread[100];
		for(int i=0;i<100;i++){
			buyerThread[i] = new Thread(buyer);
			buyerThread[i].start();
		}
		
		System.out.println("go ......");
		startSignal.countDown();
		try{
			while(System.in.read() != '\n');
		}catch(IOException e){
			
		}
		System.out.println("terminating......");
		for(Thread t : sellerThread){
			t.interrupt();
		}
		for(Thread t : buyerThread){
			t.interrupt();
		}
		
		try{
			stopSignal.await();
		}catch(InterruptedException e){
			
		}
		
		System.out.println("closing down");
	}

}


class Sellerr implements Runnable{
	private BlockingQueue orderQueue;
	private boolean shutdownRequest = false;
	private static int id;
	private CountDownLatch startLatch,stopLatch;
	
	public Sellerr(BlockingQueue orderQueue,CountDownLatch startLatch,CountDownLatch stopLatch){
		this.orderQueue = orderQueue;
		this.startLatch = startLatch;
		this.stopLatch = stopLatch;
	}
	
	public void run(){
		try{
			startLatch.await();
		}catch(InterruptedException e){
			
		}
		while(shutdownRequest == false){
			Integer quantity = (int)(Math.random() * 100);
			try{
				orderQueue.put(quantity);
				System.out.println("Sell order producer # " + Thread.currentThread().getName() + ":" + quantity);
			}catch(InterruptedException e){
				shutdownRequest = true;
			}
		}
		stopLatch.countDown();
	}
}

class Buyerr implements Runnable{
	private BlockingQueue orderQueue;
	private Boolean shutdownRequest = false;
	private CountDownLatch startLatch,stopLatch;
	
	public Buyerr(BlockingQueue orderQueue,CountDownLatch startLatch,CountDownLatch stopLatch){
		this.orderQueue = orderQueue;
		this.startLatch = startLatch;
		this.stopLatch = stopLatch;
	}
	
	public void run(){
		try{
			startLatch.await();
		}catch(InterruptedException e){
			
		}
		while(shutdownRequest == false){
			try{
				Integer quantity = (Integer) orderQueue.take();
				System.out.println("Buy order consumer " + Thread.currentThread().getName() + ":" + quantity);
			}catch(InterruptedException e){
				shutdownRequest = true;
			}
		}
		stopLatch.countDown();
	}
}