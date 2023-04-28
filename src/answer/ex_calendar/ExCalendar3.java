package answer.ex_calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * ChatGPTに作らせたプログラムです.
 * 
 * 一発ではできなかったので、何度か修正依頼をして最後は人間が微修正しました。
 * 
 * @author igamasayuki
 *
 */
public class ExCalendar3 {
    private static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {
        int year = 2023;
        int month = 4;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDay = date.getDayOfWeek();
        int lastDay = date.lengthOfMonth();

        System.out.println(year + "年" + month + "月のカレンダー");
        System.out.println("日\t月\t火\t水\t木\t金\t土");

        for (int i = 1; i <= firstDay.getValue(); i++) {
            System.out.print("■\t");
        }

        for (int day = 1; day <= lastDay; day++) {
            System.out.print(day);
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
            date = date.plusDays(1);
        }

        for (int i = date.getDayOfWeek().getValue(); i < DAYS_IN_WEEK; i++) {
            System.out.print("■");
            if (i != DAYS_IN_WEEK) {
                System.out.print("\t");
            }
        }
    }
}



