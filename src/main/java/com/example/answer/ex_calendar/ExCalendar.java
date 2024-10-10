package com.example.answer.ex_calendar;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class ExCalendar {
	public static void main(String[] args) {
		int year = 2023;
		final int WEEK_LENGTH = 4;
		int month = WEEK_LENGTH;
		System.out.println(year + "年" + month + "月のカレンダー");

		// カレンダー全体を入れるリスト
		List<List<String>> weekList = new ArrayList<>();
		// 1週間分を入れるリスト
		List<String> dayList = new ArrayList<>();
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		// 指定年月の１日のLocalDateオブジェクトを生成
		LocalDate tempDay = LocalDate.of(year, month, 1);
		// 1日の曜日を取得
		DayOfWeek dayOfWeek = tempDay.getDayOfWeek();
		int dayOfWeekValue = dayOfWeek.getValue();
		final int SUMDAY = 7;
		if (dayOfWeekValue != SUMDAY) {
			//日曜日始まり以外は前の月の箇所に■を入れる
			for (int i = 0; i < dayOfWeekValue; i++) {
				dayList.add("■");
			}
		}
		// 指定年月の最後の日のLocalDateオブジェクトを生成
		LocalDate lastDay = tempDay.with(TemporalAdjusters.lastDayOfMonth());

		// カレンダー作成
		for (int i = dayList.size(); true; i++) {
			String day = String.valueOf(tempDay.getDayOfMonth());
			dayList.add(day);
			if (i == 6) {
				// 1週間分addしたら新しいリストを作る
				weekList.add(dayList);
				i = -1; // 次のループからはまた0からカウントするため
				dayList = new ArrayList<>();
			}
			if (tempDay.equals(lastDay)) {
				// 月末日だったら最終週をweekListに入れてループを抜ける
				if (dayList.size() < SUMDAY) {
					for (i = dayList.size(); i < SUMDAY; i++) {
						dayList.add("■");
					}
				}
				weekList.add(dayList);
				break;
			}
			tempDay = tempDay.plusDays(1);
		}

		// カレンダー表示
		for (List<String> viewDayList : weekList) {
			for (String day : viewDayList) {
				System.out.print(day + "\t");
			}
			System.out.println();
		}

	}
}
