package com.demo.util.genericdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> ts = new TreeSet<Person>();

		ts.add(new Person("lisi1", 12));
		ts.add(new Person("lisi3", 123));
		ts.add(new Person("lisi1", 12));
		ts.add(new Person("lisi0", 22));

		Iterator<Person> it = ts.iterator();

		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}
	}

}

class Person implements Comparable<Person> {
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

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Person o) {
		int temp = this.getAge() - o.getAge();
		return temp == 0 ? this.getName().compareTo(o.getName()) : temp;
	}

}