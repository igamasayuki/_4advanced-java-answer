package com.example.ex_full_review_answer;

import java.time.LocalDate;

/**
 * 西暦から和暦と年齢を出力.<br>
 * 西暦はコマンドライン引数で渡す
 * 
 * @author igamasayuki
 *
 */
public class Ex10 {
	public static void main(String[] args) {
		int seireki = 1979;
		final int START_TAISYO = 1912;
		final int START_SHOWA = 1926;
		final int START_HEISEI = 1989;
		String wareki = null;
		if (START_TAISYO <= seireki && seireki < START_SHOWA) {
			// 大正
			int intWareki = seireki - START_TAISYO + 1;
			if (intWareki == 1) {
				wareki = "大正元";
			} else {
				wareki = "大正" + intWareki;
			}
		} else if (START_SHOWA <= seireki && seireki < START_HEISEI) {
			// 昭和
			int intWareki = seireki - START_SHOWA + 1;
			if (intWareki == 1) {
				wareki = "昭和元";
			} else {
				wareki = "昭和" + intWareki;
			}
		} else if (START_HEISEI <= seireki) {
			// 平成
			int intWareki = seireki - START_HEISEI + 1;
			if (intWareki == 1) {
				wareki = "平成元";
			} else {
				wareki = "平成" + intWareki;
			}
		}

		// 年齢
		int age = LocalDate.now().getYear() - seireki;
		System.out.println(wareki + "年生まれで" + age + "歳です");

	}

}
