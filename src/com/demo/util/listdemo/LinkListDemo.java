package com.demo.util.listdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linklist = new LinkedList();
	
		linklist.addFirst("abc1");
		linklist.addFirst("abc2");
		linklist.addFirst("abc3");
		linklist.addFirst("abc4");
		
		
		System.out.println(linklist);
		/*Iterator it = linklist.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
	}

}
