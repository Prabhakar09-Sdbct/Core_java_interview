package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalryMorThnTuThousnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = Arrays.asList(new Employee("Prabhakar", 1000.0), new Employee("Alka", 3000.0),
				new Employee("Shried", 2000.0), new Employee("Yogendra", 4000.0));
		List<Employee> newList = list.stream().filter(n -> n.salary() > 2000).collect(Collectors.toList());

		newList.forEach(e -> System.out.println(e.name() + " salary:  " + e.salary()));

	}

}
