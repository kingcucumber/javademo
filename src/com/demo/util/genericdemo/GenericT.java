package com.demo.util.genericdemo;

public class GenericT<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <W> void show(W s){
		System.out.println("show:" + s);
	}
	
	public void print(T s){
		System.out.println("print:" + s);
	}
}
