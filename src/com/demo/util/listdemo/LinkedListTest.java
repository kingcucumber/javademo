package com.demo.util.listdemo;

import java.util.LinkedList;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MockQueue queue = new MockQueue();
		queue.add("abc1");
		queue.add("abc2");
		queue.add("abc3");
		while(!queue.isEmpty()){
			System.out.println(queue.get());
		}
	}
}

class MockQueue {
	private LinkedList linklist;

	MockQueue() {
		linklist = new LinkedList();
	}

	public void add(Object obj) {
		linklist.add(obj);
	}

	public Object get() {
		return linklist.removeFirst();
	}

	public boolean isEmpty() {
		return linklist.isEmpty();
	}
}