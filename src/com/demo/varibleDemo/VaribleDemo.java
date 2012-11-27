package com.demo.varibleDemo;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class VaribleDemo {

	@Test
	public void testSum() {
		sum(1, 2, 3, 4, 5, 6);
	}

	public void sum(int... nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		System.out.println(sum);
	}

	@Test
	public void testAs() {
		as(1, 2, 3, 4, 5, 6);
	}

	public void as(int x, int... nums) {

	}

	@Test
	public void bb() {
		List list = Arrays.asList("1", "2", "3", "4");
		System.out.println(list);

		String arr[] = { "11", "22", "33", "44" };
		list = Arrays.asList(arr);
		System.out.println(list);

		int nums[] = { 10, 20, 30, 40 };
		list = Arrays.asList(nums);
		System.out.println(list);
	}

}
