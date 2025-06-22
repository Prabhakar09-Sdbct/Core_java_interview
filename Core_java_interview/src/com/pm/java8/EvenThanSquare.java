package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return salary + " " + name;
	}

}

public class EvenThanSquare {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4);
		
		List<Integer> list1 = list.stream().filter(a -> a % 2 == 0).map(n -> n*n).collect(Collectors.toList());
		
		System.out.println(list1);
				
	}

}
