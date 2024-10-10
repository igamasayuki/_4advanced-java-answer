package com.example.sample.exam_enum;

/**
 * 曜日を表す定数群.
 * 
 * @author igamasayuki
 */
public class DayOfWeekConstant {
	public final static int SUNDAY = 1;
	public final static int MONDAY = 2;
	public final static int TUESDAY = 3;
	public final static int WEDNESDAY = 4;
	public final static int THURSDAY = 5;
	public final static int FRIDAY = 6;
	public final static int SATURDAY = 7;

	/**
	 * 日本語の曜日名を取得します.
	 * 
	 * @param dayOfWeek 曜日を表すint型の値
	 * @return 日本語曜日名
	 */
	public static String getName(int dayOfWeek) {

		if (dayOfWeek == SUNDAY) {
			return "日";
		} else if (dayOfWeek == MONDAY) {
			return "月";
		} else if (dayOfWeek == TUESDAY) {
			return "火";
		} else if (dayOfWeek == WEDNESDAY) {
			return "水";
		} else if (dayOfWeek == THURSDAY) {
			return "木";
		} else if (dayOfWeek == FRIDAY) {
			return "金";
		} else if (dayOfWeek == SATURDAY) {
			return "土";
		} else {
			return "予期しない値が渡されました！";
		}
	}
}
