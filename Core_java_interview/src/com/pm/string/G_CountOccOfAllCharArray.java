package com.pm.string;

public class G_CountOccOfAllCharArray {

	public static void main(String[] args) {
		String[] a = { "Prabhakar Mandloi" };
		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int i = 0; i <= a.length - 1; i++) {
                for(int j = a[i].length()-1; j>= 0; j--) {
                	char c = a[i].charAt(j);
    				if(ch == c) {
    					count++;
    				}
                }
			}
			if(count != 0) {
				System.out.println(ch +" "+ count);
				count = 0;
			}
		}

	}

}
