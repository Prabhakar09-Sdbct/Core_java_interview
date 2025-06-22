package com.pm.string;

import java.util.Arrays;

public class K_Anagram {
	
	public static void main(String[] args) {
		String str1 = "prab";
		String str2 = "arpb";
		
		char[] a1 = str1.toCharArray();
		char[] a2 = str2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
	
		if (Arrays.equals(a1,a2)) {
			System.out.println("This is anagram");
		} else {
			System.out.println("This is not anagram");
		}
	}

}
