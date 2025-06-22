package com.pm.string;

public class H_CountDigitsInString {
	
	public static void main(String[] args) {
		String str = "Prabhakar12345";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("No Of Int From String :" + count);
	}

}
