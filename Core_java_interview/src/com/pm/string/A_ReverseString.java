package com.pm.string;

public class A_ReverseString {
	
	public static void main(String[] args) {
		String str = "Prabhakar Mandloi";
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			System.out.print(str.charAt(i));
		}
	}

}
