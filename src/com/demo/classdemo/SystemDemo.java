package com.demo.classdemo;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String LINESEPARATOR = System.getProperty("line.separator");
		Properties prop = System.getProperties();
		Set<String> keySet = prop.stringPropertyNames();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key + " = " + prop.getProperty(key));
		}
	}

}
