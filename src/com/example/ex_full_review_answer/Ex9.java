package com.example.ex_full_review_answer;

import java.time.LocalDateTime;

/**
 * コマンドライン引数で受け取った数値から1年2ヶ月3日4時間5分6秒後の時間を出力.<br>
 * 
 * @author igamasayuki
 *
 */
public class Ex9 {

	public static void main(String[] args) {
		int year = 2014;
		int month = 12;
		int day = 25;
		int hour = 15;
		int minute = 4;
		int second = 59;

		LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
		System.out.println(
				year + "年" + month + "月" + day + "日" + hour + "時" + minute + "分" + second + "秒の１年２か月３日４時間５分６秒後は");
		localDateTime = localDateTime.plusYears(1);
		localDateTime = localDateTime.plusMonths(2);
		localDateTime = localDateTime.plusDays(3);
		localDateTime = localDateTime.plusHours(4);
		localDateTime = localDateTime.plusMinutes(5);
		localDateTime = localDateTime.plusSeconds(6);
		System.out.println(localDateTime.getYear() + "年" + localDateTime.getMonthValue() + "月"
				+ localDateTime.getDayOfMonth() + "日" + localDateTime.getHour() + "時" + localDateTime.getMinute() + "分"
				+ localDateTime.getSecond() + "秒です");
	}

}
