package com.demo.util.genericdemo;

public class GenericDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericT<Student> ts = new GenericT<Student>();
		
		ts.setT(new Student());
		Student s = ts.getT();
		System.out.println(s.getName());
	}

}
