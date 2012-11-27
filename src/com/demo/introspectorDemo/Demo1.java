package com.demo.introspectorDemo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

public class Demo1 {
	@Test
	public void test1() throws Exception {
		BeanInfo info = Introspector.getBeanInfo(Person.class, Object.class);
		PropertyDescriptor[] pds = info.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			System.out.println(pd.getName());
		}
	}

	@Test
	public void test2() throws Exception {
		Person p = new Person();
		PropertyDescriptor pds = new PropertyDescriptor("age", Person.class);
		Method method = pds.getWriteMethod();
		method.invoke(p, 12);

		method = pds.getReadMethod();
		System.out.println(method.invoke(p, null));
	}
	@Test
	public void test3() throws Exception {
		Person p = new Person();
		PropertyDescriptor pds = new PropertyDescriptor("password", Person.class);
		System.out.println(pds.getPropertyType());
	}
		
	
}
