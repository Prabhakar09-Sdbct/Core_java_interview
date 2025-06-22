package com.pm.javabasic;

public class CountNoOfInt {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		int num = 50;
		int temp = -1;
		
		for (int i = 0; i < a.length; i++) {
			if(num == a[i]) {
				temp = i;
			}
		}
		
		System.out.println(temp);

	}

}
