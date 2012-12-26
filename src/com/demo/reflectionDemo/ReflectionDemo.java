package com.demo.reflectionDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class ReflectionDemo {
	//���乹�캯��
	@Test
	public void test() throws Exception{
		//1.
		Class clazz = Class.forName("com.demo.reflectionDemo.Person");
		Constructor c = clazz.getConstructor(null);
		Person p = (Person)c.newInstance(null);
		
		System.out.println(p.name);
		
		//2.
		//Class clazz1 = new Person().getClass();
		//3.
		//Class clazz2 = Person.class;
	}
	
	@Test
	public void test1() throws Exception{
		Class clazz1 = Class.forName("com.demo.reflectionDemo.Person");
		Constructor c = clazz1.getConstructor(String.class);
		Person p = (Person)c.newInstance("xxxxx");
		System.out.println(p.name);
	}
	
	@Test
	public void test2() throws Exception{
		Class clazz2 = Class.forName("com.demo.reflectionDemo.Person");
		Constructor c =  clazz2.getConstructor(String.class,String.class);
		Person p = (Person)c.newInstance("jack","just4fun");
		System.out.println(p.name);
	}
	
	@Test
	public void test3() throws Exception{
		Class clazz2 = Class.forName("com.demo.reflectionDemo.Person");
		Constructor c =  clazz2.getDeclaredConstructor(List.class);
		c.setAccessible(true);
		Person p = (Person)c.newInstance(new ArrayList());
		System.out.println(p.name);
	}
	@Test
	public void test4() throws Exception {
		Class clazz3 = Class.forName("com.demo.reflectionDemo.Person");
		Person p = (Person) clazz3.newInstance();
		System.out.println(p.name);
	}
	
	
	//���䷽��
	@Test
	public void example() throws Exception{
		Person p = new Person();
		Class clasz = Class.forName("com.demo.reflectionDemo.Person");
		Method method = clasz.getMethod("aa", null);
		
		method.invoke(p, null);
	}
	
	@Test
	public void example1() throws Exception{
		Person p = new Person();
		Class clasz = Class.forName("com.demo.reflectionDemo.Person");
		Method method = clasz.getMethod("bb",String.class,int.class);
		method.invoke(p, "xxx",38);
	}
	@Test
	public void example2() throws Exception{
		Person p = new Person();
		Class clasz = Class.forName("com.demo.reflectionDemo.Person");
		Method method = clasz.getMethod("cc",String.class,int[].class);
		method.invoke(p, "xxx",new int[]{1,2,3});
	}
	
	@Test
	public void example3() throws Exception{
		Person p = new Person();
		Class clasz = Class.forName("com.demo.reflectionDemo.Person");
		Method method = clasz.getDeclaredMethod("aa1",InputStream.class);
		method.setAccessible(true);
		method.invoke(p,new FileInputStream("C:\\1.txt"));
	}
	
	@Test
	public void example4() throws Exception{
		Class clasz = Class.forName("com.demo.reflectionDemo.Person");
		Method method = clasz.getMethod("bb1",int.class);
		method.invoke(null,38);
	}
	@Test
	public void example5() throws Exception{
		Class clasz = Class.forName("com.demo.reflectionDemo.Person");
		Method method = clasz.getMethod("main",String.class);
		method.invoke(null,(Object)new String[]{"aa","bb"});
	}
	
	//�����ֶ�
	@Test
	public void tst() throws Exception{
		Person p = new Person();
		
		Class claz = Class.forName("com.demo.reflectionDemo.Person");
		Field f = claz.getField("name");
		Object value = f.get(p);
		Class type = f.getType();
		if(type.equals(String.class)){
			String svalue = (String)value;
			System.out.println(svalue);
		}
		f.set(p, "xxxxxxxxx");
		System.out.println(p.name);
	}
	
	
	@Test
	public void tst2() throws Exception{
		
	}
}
