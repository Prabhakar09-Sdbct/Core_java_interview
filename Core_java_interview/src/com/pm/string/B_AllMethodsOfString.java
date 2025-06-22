package com.pm.string;

public class B_AllMethodsOfString {

	public static void main(String[] args) {
		String str = "Prabhakar Mandloi";

		String str1 = "PK";
		
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('P'));
		System.out.println(str.replace('P', 'Q'));
		System.out.println(str.split(" "));
		System.out.println(str.equals(str));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.startsWith("Pra"));
		System.out.println(str.substring(0,9));
		System.out.println(str.concat(str1));
		System.out.println(str.trim());
	}

}
