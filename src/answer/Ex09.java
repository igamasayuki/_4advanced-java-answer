package answer;

import java.time.LocalDateTime;

public class Ex09 {

	public static void main(String[] args) {
		// 年月日時分秒を指定してLocalDateTimeオブジェクトを生成
		LocalDateTime localDateTime 
			= LocalDateTime.of(2020,1,1,0,0,0);
		
		// 年月日時分秒を進める
		localDateTime = localDateTime.plusYears(1);
		localDateTime = localDateTime.plusMonths(2);
		localDateTime = localDateTime.plusDays(3);
		localDateTime = localDateTime.plusHours(4);
		localDateTime = localDateTime.plusMinutes(5);
		localDateTime = localDateTime.plusSeconds(6);
		System.out.println(localDateTime);
	}

}
