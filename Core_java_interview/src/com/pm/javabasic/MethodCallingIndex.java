package com.pm.javabasic;

public class MethodCallingIndex {

	public static int index(int[] a, int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 60 };
		int num = 30;
		int index = index(a, num);

		if (index != -1) {
			System.out.println("available " + index);
		} else {
			System.out.println("not available " + index);
		}

	}

}
