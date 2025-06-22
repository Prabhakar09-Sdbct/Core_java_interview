package com.pm.javabasic;

public class PostAndPreIncreament {

	public static void main(String[] args) {

		int i = -5;

        int result = i-- + --i + ++i + i++ + --i + i-- + --i + ++i + --i + ++i;

        System.out.println("Result: " + result);
        System.out.println("Final i: " + i);
	}

}
