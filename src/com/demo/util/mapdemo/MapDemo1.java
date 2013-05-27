package com.demo.util.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		//method(map);
//		method1(map);
		method2(map);
		
	}

	public static void method(Map<Integer,String> map){
		System.out.println(map.put(8, "wangcai"));
		System.out.println(map.put(8, "xiaoqiang"));
		map.put(2, "zhangsn");
		map.put(3, "zhgsn");
		System.out.println("containKey:" + map.containsKey(2));
		System.out.println("get:" + map.get(4));
		System.out.println(map);
		System.out.println("remove:" + map.remove(2));
		
		System.out.println(map);
		
	}
	
	public static void method1(Map<Integer,String> map){
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "aadsa");
		map.put(4, "abbbb");
		map.put(5, "accc");
		map.put(6, "addd");
		Set<Integer> set = map.keySet();
		for(Integer element : set){
			System.out.println(map.get(element));
		}
	}
	
	public static void method2(Map<Integer,String> map){
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "aadsa");
		map.put(4, "abbbb");
		map.put(5, "accc");
		map.put(6, "addd");
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry<Integer,String>> it = set.iterator();
		
		Collection<String> values = map.values();
		Iterator<String> iterator = values.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		/*while(it.hasNext()){
			Map.Entry<Integer, String> em = it.next();
			
			System.out.println(em.getKey() + "....."+ em.getValue());
		}*/
	}
}
