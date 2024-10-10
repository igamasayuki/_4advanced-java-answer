package com.example.sample.exam_enum;

public class EnumSample1 {
	public static void main(String[] args) {
		// 日曜日を表すenumを操作
		System.out.println(DayOfWeek.SUNDAY.getKey());
		System.out.println(DayOfWeek.SUNDAY.getComment());

		// 「水」という日本語文字列から水曜日を表すenumを取得
		DayOfWeek dayOfWeek = DayOfWeek.of("水");
		System.out.println(dayOfWeek.getComment());
	}
}
