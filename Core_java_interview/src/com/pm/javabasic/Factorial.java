package com.pm.javabasic;

public class Factorial {

	public static void main(String[] args) {
//		int num = 6;
//
//		int fact = 1;
//
//		for (int i = num; i > 0; i--) {
//			fact = fact * i;
//		}
//		System.out.print(fact);
		
		int num = 6;
		int fact = 1;
		for(int i = 2; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
