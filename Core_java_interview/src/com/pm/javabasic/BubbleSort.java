package com.pm.javabasic;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 50, 30, 20, 50, 40 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

}
