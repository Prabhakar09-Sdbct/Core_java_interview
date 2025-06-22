package com.pm.string;

public class F_CountOccOfAllChar {

	public static void main(String[] args) {

		String str = "Prabhakar Mandloi";
		int count = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int i = 0; i <= str.length() - 1; i++) {
				char c = str.charAt(i);

				if (ch == c) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(ch + " " + count);
				count = 0;
			}
		}
	}

}
