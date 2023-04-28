package sample.exam_api;
import java.time.LocalDateTime;

/**
 * 任意の日時を指定して、LocalDateTimeオブジェクトを生成する方法<br>
 * および、LocalDateTimeオブジェクトの中身を取得する方法.
 * 
 * @author igamasayuki
 *
 */
public class DateTimeSample2 {

	public static void main(String[] args) {
		// 年月日時分秒ナノ秒を指定してLocalDateTimeオブジェクトを生成
		LocalDateTime localDateTime 
			= LocalDateTime.of(2016,1,2,3,4,5,999999999);
		System.out.println("日付と時間：" + localDateTime);
		
		// 年月日時分秒ナノ秒をひとつずつ取り出す
		int year = localDateTime.getYear();
		System.out.println("年：" + year);
		int month = localDateTime.getMonthValue();
		System.out.println("月：" + month);
		int dayOfMonth = localDateTime.getDayOfMonth();
		System.out.println("日：" + dayOfMonth);
		int hour = localDateTime.getHour();
		System.out.println("時：" + hour);
		int minute = localDateTime.getMinute();
		System.out.println("分：" + minute);
		int second = localDateTime.getSecond();
		System.out.println("秒：" + second);
		int nano = localDateTime.getNano();
		System.out.println("ナノ秒：" + nano);
	}

}
