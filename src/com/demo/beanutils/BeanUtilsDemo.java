package com.demo.beanutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

public class BeanUtilsDemo {
	@Test
	public void test1()throws Exception{
		Person p = new Person();
		BeanUtils.setProperty(p, "name", "xxx");
		
		System.out.println(p.getName());
	}
	
	@Test
	public void test2() throws Exception{
		String name = "aaaa";
		String password = "123";
		String age = "23";
		String birthday  = "1988-12-29";
		
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "password", password);
		BeanUtils.setProperty(p, "age", age);
		BeanUtils.setProperty(p, "birthday", birthday);
		
		System.out.println(p.getName());
		System.out.println(p.getPassword());
		System.out.println(p.getAge());
		System.out.println(p.getBirthday());
		
	}
	
	@Test
	public void test3() throws Exception{
		String name = "aaaa";
		String password = "123";
		String age = "23";
		String birthday  = "1988-12-29";
		
		ConvertUtils.register((new Converter(){
			public Object convert(Class type, Object value){
				if(value == null){
					return null;
				}
				if(!(value instanceof String)){
					throw new ConversionException("本老爷只支持string的转换");
				}
				String str = (String) value;
				if(str.trim().equals("")){
					return null;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-DD");
				try {
					return df.parse(str);
				} catch (ParseException e) {
					throw new RuntimeException(e);
				}
			}
		}), Date.class);
		
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "password", password);
		BeanUtils.setProperty(p, "age", age);
		BeanUtils.setProperty(p, "birthday", birthday);
		
		System.out.println(p.getName());
		System.out.println(p.getPassword());
		System.out.println(p.getAge());
		System.out.println(p.getBirthday());
		
	}
	
	@Test
	public void test4() throws Exception{
		String name = "aaaa";
		String password = "123";
		String age = "23";
		String birthday  = "1988-12-29";
		
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "password", password);
		BeanUtils.setProperty(p, "age", age);
		BeanUtils.setProperty(p, "birthday", birthday);
		
		System.out.println(p.getName());
		System.out.println(p.getPassword());
		System.out.println(p.getAge());
		System.out.println(p.getBirthday());
		
	}
	
	public void test5() throws Exception{
		Map map =new HashMap();
		map.put("name","aaa");
		map.put("password", "1234");
		map.put("age", "23");
		map.put("birthday", "1988-12-29");
		
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		Person bean = new Person();
		BeanUtils.populate(bean, map);
		
		System.out.println(bean.getName());
		System.out.println(bean.getPassword());
		System.out.println(bean.getAge());
		System.out.println(bean.getBirthday());
		
	}
}
