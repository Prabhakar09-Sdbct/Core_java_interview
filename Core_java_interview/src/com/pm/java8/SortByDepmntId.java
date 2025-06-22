package com.pm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

record Employees(String name, int departmentId) {
}

public class SortByDepmntId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees> list = Arrays.asList(new Employees("Prabhakar", 1), new Employees("Alka", 3),
				new Employees("Shried", 2), new Employees("Yogendra", 4));

		List<Employees> newList = list.stream().sorted(Comparator.comparingInt(Employees::departmentId))
				.collect(Collectors.toList());

		newList.forEach(e -> System.out.println(e.name() + " department Id : " + e.departmentId()));

	}

}
