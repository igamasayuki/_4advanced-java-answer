package com.example.answer;

public class Ex15 {
	public static void main(String[] args) {
		Car car = new Car();
		car.run(40);

		try {
			car.run(200);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
