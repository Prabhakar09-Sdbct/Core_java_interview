package com.pm.javabasic;

public class FunctionalIntTest {

	public static void main(String[] args) {

		FunctionalInterf fi = new FunctionalInterf() {

			@Override
			public int sum(int a, int b) {

				return a + b;
			}
		};
		int a = 10;
		int b = 20;
		
		System.out.println(fi.sum(a, b));
		
		fi.sub(a, b);
		
		FunctionalInterf.multi(a, b);

	}

}
