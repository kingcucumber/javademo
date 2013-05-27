package com.demo.util.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new LinkedHashSet();
		
		hs.add("haha");
		hs.add("xixi");
		hs.add("hehe");
		hs.add("heihie");
		
	//	String str = new String();
		
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
