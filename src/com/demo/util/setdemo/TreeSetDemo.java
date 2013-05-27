package com.demo.util.setdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add("abc");
		ts.add("adc");
		ts.add("adsdc");
		ts.add("nba");
		ts.add("cba");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}


