package com.pm.javabasic;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of birth");
		
		int birthYear = sc.nextInt();
		
		int currentYear = LocalDate.now().getYear();
		
		System.out.println(currentYear - birthYear);
	}

}
