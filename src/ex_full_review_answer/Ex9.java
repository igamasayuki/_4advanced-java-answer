package ex_full_review_answer;

import java.time.LocalDateTime;

/**
 * コマンドライン引数で受け取った数値から1年2ヶ月3日4時間5分6秒後の時間を出力.<br>
 * 
 * @author igamasayuki
 *
 */
public class Ex9 {

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = Integer.parseInt(args[2]);
		int hour = Integer.parseInt(args[3]);
		int minute = Integer.parseInt(args[4]);
		int second = Integer.parseInt(args[5]);

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
