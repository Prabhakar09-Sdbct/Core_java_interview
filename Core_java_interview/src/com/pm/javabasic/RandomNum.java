package com.pm.javabasic;

public class RandomNum {

	public static void main(String[] args) {

		int n = 5;
		
		int random = 0;
		
		for(int i = 0; i< n; i++) {
			random = (int) (Math.random() * 1000);
			System.out.println(random);
		}

	}

}
