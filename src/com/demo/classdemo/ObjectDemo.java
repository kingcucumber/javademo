package com.demo.classdemo;

public class ObjectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("zhangsan", 12);
		Person p2 = new Person("zhangsan", 12);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() == p2.hashCode());
	}

}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
