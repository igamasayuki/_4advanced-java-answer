package com.example.sample.exam_exception;

public class ExceptionSample2 {
	public static void main(String[] args) {
		System.out.println("プログラム開始");

		try {
			Class.forName("java.lang.NotExistClass");
			System.out.println("例外が発生しませんでした");
		} catch (ClassNotFoundException e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
		
		System.out.println("プログラム終了");
	}
}