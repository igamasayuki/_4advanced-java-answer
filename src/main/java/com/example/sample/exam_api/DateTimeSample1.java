package com.example.sample.exam_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Java8で追加されたjava.timeパッケージ内の基本クラスを紹介.
 * 
 * @author igamasayuki
 *
 */
public class DateTimeSample1 {

	public static void main(String[] args) {
		// 日付を表すクラス
		LocalDate localDate = LocalDate.now();
		System.out.println("現在の日付：" + localDate);
		// 時間を表すクラス
		LocalTime localTime = LocalTime.now();
		System.out.println("現在の時間：" + localTime);
		// 日付と時間
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("現在の日付と時間：" + localDateTime);
	}

}
