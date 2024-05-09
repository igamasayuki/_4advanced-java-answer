package com.example.ex_full_review_answer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 東京オリンピックと私の誕生日の曜日を求める.
 * 
 * @author igamasayuki
 *
 */
public class Ex8 {
	public static void main(String[] args) {
		LocalDate local_date = LocalDate.of(2020, 7, 24);// 年、月、日をセット
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日E曜日");
		System.out.println("東京オリンピックが開催されるのは" + local_date.format(formatter) + "です。");

		local_date = LocalDate.of(1979, 7, 27);
		System.out.println("私の誕生日は" + local_date.format(formatter) + "です。");
	}

}
