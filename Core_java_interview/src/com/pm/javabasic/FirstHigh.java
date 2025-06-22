package com.pm.javabasic;

public class FirstHigh {

	public static void main(String[] args) {
		int[] a = { 10, 30, 40, 50, 20 };

		int temp = 0;
		
		int secHigh = 0;

		int n = a.length;
		
		for (int i = 0; i < n; i++) {
			if(a[i] > temp) {
				secHigh = temp;
				temp = a[i];
			} else if (a[i] > secHigh && secHigh != temp) {
				secHigh = a[i];
			}
			
		}
		System.out.println(" <<< "+secHigh);
		System.out.println(temp);
	}

}
