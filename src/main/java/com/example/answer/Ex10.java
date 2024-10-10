package com.example.answer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex10 {

	public static void main(String[] args) {
		// 年月日を指定してLocalDateオブジェクトを生成
		LocalDate localDate = LocalDate.of(2020, 7, 27);

		// 「yyyy/MM/dd」という形式で出力する
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		println(localDate, formatter);
		// 「yyyy年M月d日」という形式で出力する
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年M月d日");
		println(localDate, formatter2);
		// 「yyyy年MM月dd日(E)」という形式で出力する
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)");
		println(localDate, formatter3);
	}

	/**
	 * 日付を指定されたフォーマットで出力する
	 * @param localDate フォーマットしたい日付オブジェクト
	 * @param formatter フォーマッター
	 */
	private static void println(LocalDate localDate, DateTimeFormatter formatter) {
		String format = localDate.format(formatter);
		System.out.println(format);
	}

}
