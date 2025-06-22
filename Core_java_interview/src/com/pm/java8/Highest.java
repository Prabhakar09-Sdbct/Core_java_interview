package com.pm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Highest {
	
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Prabhakar", 1000.0), 
				new Employee("Alka", 3000.0), 
				new Employee("Shried", 2000.0)
				);
		
		double highest = list.stream().map(Employee::salary).sorted(Comparator.reverseOrder()).findFirst().orElse(0.0);
		
		System.out.println(highest);
		
		
	}

}
