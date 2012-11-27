package com.demo.genericDemo;

public class Demo {

	public void testa() {
		a("aaa");
	}

	public <T> T a(T t) {
		return null;
	}

	public <T, E, K> void b(T t, E e, K k) {

	}

	public <T> void swap(T arr[], int pos1, int pos2) {
		T temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

	public <T> void reverse(T arr[]) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			T temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}

class Demo1<T, E, K> {
	public void test() {

	}

	public void a(T t) {

	}

	public void b(T t, E e, K k) {

	}
}
