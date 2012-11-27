package com.demo.varibleDemo;

import org.junit.Test;


public class EnumerDemo {
	@Test
	public void print(){
		test(Grade.A);
	}
	public void test(Grade g){
		String value = g.getValue();
		System.out.println(value);
	}
	
	@Test
	public void test1(){
		System.out.println(Grade.A.name());
		System.out.println(Grade.A.ordinal());
		
		String str = "E";
		Grade g = Grade.valueOf(Grade.class, str);
		System.out.println(g);
		Grade gb = Grade.valueOf(str);
		System.out.println(gb);
		Grade ga[] = Grade.values();
		for (Grade gc : ga){
			System.out.println(gc);
		}
	}
}
/*
class Grade{
	private Grade(){}
	
	public static final Grade A = new Grade();
	public static final Grade B = new Grade();
	public static final Grade C = new Grade();
	public static final Grade D = new Grade();
	public static final Grade E = new Grade();
}
*/

enum Grade{
	A("100-90"){
		public  String getLocal(){
			return "优";
		}
	},
	B("89-80"){
		public String getLocal(){
			return "良";
		}
	},
	C("79-70"){
		public String getLocal(){
			return "中";
		}
	},
	D("69-60"){
		public String getLocal(){
			return "差";
		}
	},
	E("59-0"){
		public String getLocal(){
			return "不及格";
		}
	};
	
	
	private String value;
	private Grade(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	public abstract String getLocal();
}