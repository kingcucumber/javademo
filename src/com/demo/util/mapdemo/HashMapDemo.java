package com.demo.util.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student,String> hm=new HashMap<Student,String>();
		
		hm.put(new Student("lisi",23),"上海");
		hm.put(new Student("wangwu",43),"北京");
		hm.put(new Student("zhangsan",33),"广州");
		hm.put(new Student("wangwu",43),"合肥");
		
		Set<Student> keySet = hm.keySet();
		Iterator<Student> it = keySet.iterator();
		
		while(it.hasNext()){
			Student st = it.next();
			String address = hm.get(st);
			System.out.println(st.getName() + "...." + address);
		}
	}
	
}
