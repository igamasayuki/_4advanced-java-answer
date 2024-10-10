package com.example.answer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex11 {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("yyyy年MM月dd日はE曜日です");

		// オリンピック日付
		LocalDate localDate = LocalDate.of(2020, 7, 24);
		System.out.println("オリンピックが開催される");
		System.out.println(localDate.format(formatter));
		System.out.println(); // 改行

		// 誕生日
		LocalDate myBirthDate = LocalDate.of(1990, 1, 1);
		System.out.println("私の誕生日である");
		System.out.println(myBirthDate.format(formatter));

	}

}
