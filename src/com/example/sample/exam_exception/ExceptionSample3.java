package com.example.sample.exam_exception;

public class ExceptionSample3 {
	public static void main(String[] args) {
		System.out.println("プログラム開始");

		try {
			Class.forName("java.lang.NotExistClass");
			System.out.println("例外が発生しませんでした");
		} catch (ClassNotFoundException e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("その他の例外が発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("finallyブロックが実行されました");
		}

		System.out.println("プログラム終了");
	}
}