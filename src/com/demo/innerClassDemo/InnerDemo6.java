package com.demo.innerClassDemo;

public class InnerDemo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer5 out  = new Outer5();
		out.method();
	}

}

interface Inter
{
	void show1();
	void show2();
	
}
class Outer5{
	/*class Inner implements Inter	
	{
		public void show1(){
			
		}
		public void show2(){
			
		}
	}*/
	
	public void method(){
		new Inter(){
			@Override
			public void show1() {
				// TODO Auto-generated method stub
				System.out.println("show1");
			}
			
			@Override
			public void show2() {
				// TODO Auto-generated method stub
				System.out.println("show2");
				
			}
		}.show1();
	}
}


