package com.demo.util.listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		 al.add("abc1");
		 al.add("abc2");
		 al.add("abc3");
		 al.add("abc2");
		 al.add("abc1");
		 al.add("abc1");
		System.out.println(al);
		 al = getSingleElement(al);
		 System.out.println(al);
	}

	public static ArrayList getSingleElement(ArrayList al) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(!list.contains(obj)){
				list.add(obj);
			}
		}
		return list;
	}

}
