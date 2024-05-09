package com.example.sample.exam_api;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * java.timeパッケージのオブジェクト⇒文字列へ変換<br>
 * 文字列⇒java.timeパッケージのオブジェクトへ変換<br>
 * 上記を行う方法.
 * 
 * @author igamasayuki
 *
 */
public class DateTimeSample5 {

	public static void main(String[] args) {
		System.out.println("LocalDateTimeからフォーマットされた文字列へ変換");
		// 現在の日付を取得
		LocalDateTime localDateTime = LocalDateTime.now();
		// デフォルトの出力形式
		System.out.println("デフォルトの出力形式" + localDateTime);
		// 「yyyy月MM日dd HH時mm分ss秒」という形式で出力する
		DateTimeFormatter formatter 
		= DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
		String format = localDateTime.format(formatter);
		System.out.println(format);
		
		System.out.println("======================================");
		System.out.println("文字列からLocalDateTimeへ変換");
		String strLocalDateTime = "2017/12/31 23:59:59";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime localDateTime2 = LocalDateTime.parse(strLocalDateTime, formatter2);
		System.out.println("文字列から変換されたLocalDateTime:" + localDateTime2);
		
	}

}
