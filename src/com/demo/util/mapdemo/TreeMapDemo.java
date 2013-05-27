package com.demo.util.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Student,String> hm=new TreeMap<Student,String>();
		
		hm.put(new Student("lisi",23),"上海");
		hm.put(new Student("wangwu",43),"北京");
		hm.put(new Student("zhangsan",33),"广州");
//		hm.put(new Student("wangwu",43),"合肥");
		
		Iterator<Map.Entry<Student, String>> it = hm.entrySet().iterator();
		
		
		while(it.hasNext()){
			Map.Entry<Student, String> me = it.next();
			Student key = me.getKey();
			String address = me.getValue();
			System.out.println(key.getName() + "...." + address);
		}
	}

}
