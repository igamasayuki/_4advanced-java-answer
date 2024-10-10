package com.example.sample.exam_api;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * 月末を取得する方法.
 * 
 * @author igamasayuki
 *
 */
public class DateTimeSample4 {

	public static void main(String[] args) {
		// 日付を表すクラス
		LocalDate localDate = LocalDate.now();
		System.out.println("現在の日付：" + localDate);
		localDate = localDate.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("月末は" + localDate);
		// 時間を表すクラス
		LocalTime localTime = LocalTime.now();
		System.out.println("現在の時間：" + localTime);
		// LocalTimeは月の情報がないため使用できない
//		System.out.println("月末は" + localTime.with(TemporalAdjusters.lastDayOfMonth()));
		// 日付と時間
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("現在の日付と時間：" + localDateTime);
		localDateTime = localDateTime.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("月末は" + localDateTime);
	
	}

}
