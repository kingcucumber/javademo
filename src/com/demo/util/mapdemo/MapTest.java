package com.demo.util.mapdemo;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	/**
	 * @param args  改进：可以只判断count为0的就行了
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asdfadcmasdfjliemxcadsmljkdjalfdjlaeskfja";
		System.out.println(str.length());
		char[] strChar = str.toCharArray();
		Map<Character,Integer> strMap = new TreeMap<Character,Integer>();
		
		for(int i=0;i<strChar.length;i++){
			Character key = Character.valueOf(strChar[i]);
			Integer count = strMap.get(key);
			if(count == null){
				strMap.put(strChar[i], 1);
			}else{
				strMap.put(key, ++count);
			}
		}
		System.out.println(strMap);
	}

}
