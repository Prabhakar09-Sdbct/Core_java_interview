package com.pm.string;

import java.util.Arrays;

public class I_CountDigitsInStringArray {

	public static void main(String[] args) {
		String[] str = { "Prabhakar1234", "niraj123456" };
		String digit = "";
		for (String s : str) {
			for (char c : s.toCharArray()) {
				if (Character.isDigit(c)) {
					digit += c;
				}
			}
			
			
			int[] a = new int[digit.length()];
			for (int i = 0; i < digit.length(); i++) {
               a[i] = Character.getNumericValue(digit.charAt(i));
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
