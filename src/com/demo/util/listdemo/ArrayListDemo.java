package com.demo.util.listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add(new Person("lisi1",21));
		list.add(new Person("lisi2",22));
		list.add(new Person("lisi3",23));
		list.add(new Person("lisi4",24));
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			Person p = (Person) it.next();
			System.out.println(p);
		}
	}

}

class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}