package com.demo.staticDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;


public class wrapperDemo {
	public static void main(String []args){
		Integer i = new Integer(1); //×°Ïä
		int j = i ;					//²ðÏä
	}

	@Test
	public void test(){
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Object o: list){
			int i = (Integer)o;
			System.out.println(i);
		}
	}
	
	@Test
	public void test1(){
		Map map = new HashMap();
		map.put("1","aaa");
		map.put("2","bbb");
		map.put("3","ccc");
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			String value = (String)map.get(key);
			System.out.println(key + "=" + value);
		}
	}
	
	@Test 
	public void test2(){
		Map map = new LinkedHashMap();
		map.put("1","aaa");
		map.put("2","bbb");
		map.put("3","ccc");
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			String value = (String)map.get(key);
			System.out.println(key + "=" + value);
		}
	}

	@Test 
	public void test3(){
		Map map = new LinkedHashMap();
		map.put("1","aaa");
		map.put("2","bbb");
		map.put("3","ccc");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry entry = (Entry)it.next();
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key + "=" + value);
		}
	}
	
	@Test
	public void Test4(){
		int arr[] = {1,2,3};
		for(int i : arr){
			i = 10;
		}
		/*for(int i = 0 ; i< arr.length;i++){
			arr[i] = 10;
		}*/
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	}
}
