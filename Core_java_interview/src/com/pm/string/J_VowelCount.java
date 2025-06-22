package com.pm.string;

public class J_VowelCount {
	
	public static void main(String[] args) {
		String str = "Prabhakar Mandloi";
		int count = 0;
		for(int i=0; i <= str.length()-1; i++) {
			char ch = str.toLowerCase().charAt(i);
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				count ++;
//			}
			
//			if ("aeiou".indexOf(ch) != -1) {
//			    count++;
//			}
			
			if ("aeiou".contains(String.valueOf(ch))) {
			    count++;
			}
		}
		System.out.println(count);
	}

}
