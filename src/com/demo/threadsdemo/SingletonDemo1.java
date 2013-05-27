package com.demo.threadsdemo;

public class SingletonDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton {
	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}

class Singleton2 {
	private Singleton2() {
	}

	private static class SingletonHolder {
		static final Singleton2 singleton = new Singleton2();
	}

	public static Singleton2 getInstance() {
		return SingletonHolder.singleton;
	}
}

class Singleton3{
	private Singleton3(){};
	private static final Singleton3 singleton3= new Singleton3();
	public static Singleton3 getInstance(){
		return singleton3;
	}
}