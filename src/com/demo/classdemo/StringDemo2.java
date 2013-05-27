package com.demo.classdemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String[] strArray = { "nba", "abc", "cba", "zz", "qq", "haaha" };

		compare(strArray);
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
	}

	private static void compare(String[] strArray) {
		String temp = null;
		for (int i = 1; i < strArray.length; i++) {
			int j = i;
			temp = strArray[i];
			while (j > 0 && (temp.compareTo(strArray[j - 1]) < 0)) {
				strArray[j] = strArray[j - 1];
				j--;
			}
			strArray[j] = temp;
		}
	}
}
