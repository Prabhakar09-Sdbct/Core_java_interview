package com.pm.javabasic;

public class FunctionalIntLembdaTest {

	public static void main(String[] args) {
		FunctionalInterf f = (a, b) -> {
			
			return a + b;
		};
		
		int a = 10;
		int b = 20;
		
		System.out.println(f.sum(a, b));
		
		f.sub(a, b);
		
		FunctionalInterf.multi(a, b);
	}
}
