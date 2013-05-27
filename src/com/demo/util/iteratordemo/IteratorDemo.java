package com.demo.util.iteratordemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll = new ArrayList();
		
		coll.add("abc");
		coll.add("bcd");
		coll.add("cde");
		coll.add("def");
		coll.add("fgh");
		
		Iterator it = coll.iterator();
		
		while(it.hasNext()){
			String element = (String) it.next();
			System.out.println(element);
		}
		
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			String e = (String) iterator.next();
			System.out.println(e);
		}
	}

}
