package com.pm.javabasic;

public class Swapping {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
	    int temp = 0;
	    
//	    temp = a;
//	    a = b;
//	    b = temp;
	    
	    a = a + b;
	    b = a - b;
	    a = a - b;
	    
	    System.out.println("a is :"+ a + " b is :" + b);
	}

}
