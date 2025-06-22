package com.pm.javabasic;

public class ArmStrong {
	
	public static void main(String[] args) {
		
		int num = 153;
		int num2 = num;
		int temp = 0;
		
		while(num2 != 0) {
			int r = num2 % 10;
			temp += Math.pow(r, 3);
			num2 = num2 / 10;
		}
		
		if(temp == num) {
			System.out.println("This is armstrong " + num);
		} else {
			System.out.println("This is not armstrong " + num);
		}
	}

}
