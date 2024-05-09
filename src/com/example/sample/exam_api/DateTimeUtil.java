package com.example.sample.exam_api;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * 日付と時間を扱う、便利な処理をまとめたクラス.
 * 
 * @author igamasayuki
 *
 */
public class DateTimeUtil {

	/**
	 * java.time.LocalDate から java.util.Date に変換します.
	 * @param localDate java.time.LocalDateオブジェクト
	 * @return java.util.Dateオブジェクト
	 */
	public static Date localDateToUtilDate(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	/**
	 * java.time.LocalDate から java.sql.Date に変換します.
	 * @param localDate java.time.LocalDateオブジェクト
	 * @return java.sql.Dateオブジェクト
	 */
	public static java.sql.Date localDateToSqlDate(LocalDate localDate) {
		return java.sql.Date.valueOf(localDate);
	}

	/**
	 * java.util.Date から java.time.LocalDate に変換します.
	 * @param date java.utl.Dateオブジェクト
	 * @return java.time.LocalDateオブジェクト
	 */
	public static LocalDate utilDateToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	/**
	 * java.sql.Date から java.time.LocalDate に変換します.
	 * @param sqlDate java.sql.Dateオブジェクト
	 * @return java.time.LocalDateオブジェクト
	 */
	public LocalDate sqlDateToLocalDate(java.sql.Date sqlDate){
	    return sqlDate.toLocalDate();
	}
}
