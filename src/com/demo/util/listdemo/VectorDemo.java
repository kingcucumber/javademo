package com.demo.util.listdemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		 
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		System.out.println("---------------------------");
		Iterator it = v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
