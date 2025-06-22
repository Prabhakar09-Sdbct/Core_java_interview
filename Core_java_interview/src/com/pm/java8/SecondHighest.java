package com.pm.java8;

import java.util.*;
import java.util.stream.Collectors;

record Employee(String name, Double salary) { }

public class SecondHighest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ram", 3000.0));
        employees.add(new Employee("Shyam", 2500.0));
        employees.add(new Employee("Jay", 4000.0));
        employees.add(new Employee("Vijay", 4000.0));

        double secondHighestSalary = employees.stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0.0);

        System.out.println("Second highest salary: " + secondHighestSalary);

        List<Employee> secondHighestEmployees = employees.stream()
                .filter(e -> e.salary().equals(secondHighestSalary))
                .collect(Collectors.toList());

        System.out.println("Employee(s) with second highest salary:");
        secondHighestEmployees.forEach(System.out::println);
    }
}
