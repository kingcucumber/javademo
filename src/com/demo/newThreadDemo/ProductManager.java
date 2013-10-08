package com.demo.newThreadDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * 
 * a demo for exchanger
 * 
 * @author jinhuawa
 * 
 */
public class ProductManager {

	public static Exchanger<List<Integer>> exchanger = new Exchanger<List<Integer>>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread producer = new Thread(new Producer());
		Thread consumer = new Thread(new Consumer());
		
		producer.start();
		consumer.start();
		try{
			while(System.in.read()!= '\n');
		}catch(Exception e){
			e.printStackTrace();
		}
		
		producer.interrupt();
		consumer.interrupt();
	}

}

class Producer implements Runnable {
	private static List<Integer> buffer = new ArrayList<Integer>();
	private Boolean okToRun = true;
	private final int BUFFERSIZE = 10;

	public void run() {
		int j = 0;
		while (okToRun) {
			if (buffer.isEmpty()) {
				try {
					for(int i=0;i<BUFFERSIZE;i++){
						buffer.add((int)(Math.random()*100));
					}
					Thread.sleep((int)(Math.random()*1000));
					System.out.println("produce buffer:");
					for(int i:buffer){
						System.out.print(i + ",");
					}
					System.out.println("exchanging ......");
					buffer = ProductManager.exchanger.exchange(buffer);
				} catch (InterruptedException e) {
					okToRun = false;
				}
			}
		}
	}
}

class Consumer implements Runnable{
	private static List<Integer> buffer = new ArrayList<Integer>();
	private Boolean okToRun = true;
	
	public void run(){
		while(okToRun){
			try{
				if(buffer.isEmpty()){
					buffer = ProductManager.exchanger.exchange(buffer);
					System.out.println("consumer buffer:.....");
					for(int i: buffer){
						System.out.print(i + ",");
					}
					System.out.println("\n");
					Thread.sleep((int)(Math.random()*1000));
					buffer.clear();
					
				}
			}catch(InterruptedException e){
				okToRun = false;
			}
		}
	}
}