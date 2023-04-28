package answer;

import java.util.HashMap;
import java.util.Map;

public class Ex21 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("東京", "東京");
		map.put("埼玉", "さいたま");
		map.put("茨城", "⽔戸");
		map.put("沖縄", "那覇");
		String key1 = "埼玉";
		String capital1 = map.get(key1);
		System.out.println(key1 + "の県庁所在地は「" + capital1 + "」です");
		String key2 = "沖縄";
		String capital2 = map.get(key2);
		System.out.println(key2 + "の県庁所在地は「" + capital2 + "」です");
	}
}
