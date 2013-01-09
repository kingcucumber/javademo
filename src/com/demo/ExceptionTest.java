package com.demo;

public class ExceptionTest {

	public int numberOne = 1;
	public int numberTwo = 0;
	public int numberThree ;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionTest ex = new ExceptionTest();
		try{
			ex.numberThree = ex.numberOne / ex.numberTwo;
			
		}catch (Exception e) {
			new Exception("除数为零！");
			
		}/*finally{
			System.out.println("笨蛋，除数不能为零！");
		}*/
		
		System.out.println("笨蛋，除数不能为零！");
	}

}
