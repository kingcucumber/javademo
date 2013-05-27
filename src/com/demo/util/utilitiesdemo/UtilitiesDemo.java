package com.demo.util.utilitiesdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UtilitiesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
	}

	public static void demo1(){
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("adsfsdc");
		list.add("abytrc");
		list.add("aiubc");
		list.add("iuic");

		Collections.sort(list);
		System.out.println(list);
		
	}
}
