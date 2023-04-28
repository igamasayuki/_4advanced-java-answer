package ex_full_review_answer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 各国の優勝回数を表示する.
 * 
 * @author igamasayuki
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		String[] countries = { "ウルグアイ", "イタリア", "イタリア", "ウルグアイ", "ドイツ", "ブラジル", "ブラジル", "イングランド", "ブラジル", "ドイツ",
				"アルゼンチン", "イタリア", "アルゼンチン", "ドイツ", "ブラジル", "フランス", "ブラジル", "イタリア", "スペイン", "ドイツ" };
		Map<String, Integer> map = new HashMap<>();
		for (String country : countries) {
			Integer count = map.get(country);
			if (count == null) {
				// Mapに存在していない
				map.put(country, 1);
			} else {
				// Mapに存在している
				count++;
				map.put(country, count);
			}
		}
		Set<String> keySet = map.keySet();
		for (String countryName : keySet) {
			Integer count = map.get(countryName);
			System.out.println(countryName + "の優勝回数は" + count + "回です");
		}

	}

}
