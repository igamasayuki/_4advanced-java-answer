package com.example.answer;

import java.util.HashMap;
import java.util.Set;

public class Ex22 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("東京", "東京");
		map.put("埼⽟", "さいたま");
		map.put("茨城", "⽔戸");
		map.put("沖縄", "那覇");
		Set<String> set = map.keySet();
		for (String key : set) {
			String capital = map.get(key);
			System.out.println(key + "の県庁所在地は「" + capital + "」です");
		}
	}
}
