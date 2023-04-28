package answer.ex_calendar;

import java.time.LocalDate;

public class ExCalendar2 {

	public static void main(String[] args) {
		int year = 2018;
		int month = 1;
		System.out.println(year + "年"+ month + "月のカレンダー");
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		
		// 指定された年月の１日を設定
		LocalDate localdate = LocalDate.of(year,month,1);
		
		// １日が何曜日か(1:月曜日～7日曜日)
		int firstWeekOfDay = localdate.getDayOfWeek().getValue();
		
		// 空白に■を入れる
		for(int i = 0; i < firstWeekOfDay; i++) {
			System.out.print("■\t");
		}
		
		// 一週間カウンター
		// 初期値は■を打った残り
		int weekCounter = 7 - firstWeekOfDay;
		
		// 日付の入力
		for(int i = 1; i <= localdate.lengthOfMonth(); i++) { // lengthOfMonth() その月の長さを求める
			System.out.print(i + "\t");
			weekCounter--;
			if(weekCounter == 0) { // １週間の終わりに改行しカウンターリセット
				System.out.println();
				weekCounter = 7;
			}
		}
		
		// 残りの空白に■を打つ
		for(int i = 0; i < weekCounter; i++) {
			System.out.print("■\t");
		}
		
	}

}
