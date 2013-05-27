package com.demo.util.genericdemo;

public class GenericDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GenericT<String > ts = new GenericT<String>();
		ts.setT(new String("haah"));
		ts.show( new Integer(8));
		System.out.println(ts.getT());*/
		
		
	}
}

interface Inter<T>{
	public void show(T t);
	
}

class InterImpl implements Inter<String>{

	@Override
	public void show(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
}

class InterImpl2<Q> implements Inter<Q>{

	@Override
	public void show(Q t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}

