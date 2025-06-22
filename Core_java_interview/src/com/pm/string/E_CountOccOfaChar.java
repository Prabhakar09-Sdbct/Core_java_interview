package com.pm.string;

public class E_CountOccOfaChar {
	
	public static void main(String[] args) {
		String str = "Prabhakar";
		int count = 0;
		
		for(int i = 0; i< str.length(); i++) {
			char ch = str.charAt(i);
			String s = String.valueOf(ch);
			
			if(s.matches("a")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
