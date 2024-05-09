package com.example.answer;

import java.time.LocalDate;

public class Ex07 {

	public static void main(String[] args) {
		// 年月日を指定してLocalDateオブジェクトを生成
		LocalDate localDate = LocalDate.of(2016, 2, 8);

		// 年月日をひとつずつ取り出す
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int dayOfMonth = localDate.getDayOfMonth();
		System.out.println("私の誕生日は" + year + "年" + month + "月" + dayOfMonth + "日です");

	}

}
