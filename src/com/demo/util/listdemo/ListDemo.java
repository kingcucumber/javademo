package com.demo.util.listdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		show1(list);
		
	}

	public static void show(List list) {
		// TODO Auto-generated method stub
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		list.add(1, "abc5");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
	}
	
	public static void show1(List list){
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("abc2")){
				it.set("abc5");
			}
		}
		System.out.println(list);
	}

}
