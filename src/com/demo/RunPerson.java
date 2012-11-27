package com.demo;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RunPerson {
	private Person p;
	
	@Before
	public  void before(){
		 p = new Person();
		 System.out.println("before");
	}
	@Test
	public void testRun(){
			p.run();
	}
	@Test
	public void testEat(){
			p.eat();
	}
	@After
	public void after(){
	 p = null;
	 System.out.println("after");
	}
/*	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before class");
	}
	@Test
	public void testRun(){
	Person p = new Person();
		p.run();
	}
	
	@Test
	public void testEat(){
		Person p = new Person();
		p.eat();
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After class");
	}*/
	

}
