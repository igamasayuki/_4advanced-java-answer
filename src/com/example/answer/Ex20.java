package com.example.answer;

import java.util.ArrayList;
import java.util.List;

public class Ex20 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("伊賀", 33));
		list.add(new Employee("⼭田", 23));
		list.add(new Employee("佐藤", 43));
		list.add(new Employee("田中", 53));
		list.remove(1);
		list.add(1, new Employee("鈴木", 63));
		Employee employee = list.get(2);
		System.out.println("3番⽬の社員は" + employee.getName() + "です");
		for (Employee employe : list) {
			System.out.println(employe.getName());
		}
	}
}
