package sample.exam_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionSample4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("東京", "東京");
		map.put("埼玉", "さいたま");
		map.put("茨城", "⽔戸");
		map.put("沖縄", "那覇");
		
		// setを使用してMapの中身を一つずつ取り出す
		Set<String> keySet = map.keySet(); // keyのみをSetに格納
		for(String key : keySet) {
		  String capital = map.get(key);
		  System.out.println(capital);
		}
	}
}
