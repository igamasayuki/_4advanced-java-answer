package sample.exam_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample1 {
	public static void main(String[] args) {
		// 文字列を格納するためのArrayListを生成
		List<String> list = new ArrayList<>();

		// ArrayListオブジェクトに要素(Stringオブジェクト)を追加
		list.add("スイム");
		list.add("バイク");
		list.add("ラン");

		System.out.println("通常のfor文を使用してArrayList内の要素を一つずつ表示");
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			System.out.println(element);
		}

		System.out.println("拡張for文を使用してArrayList内の要素を一つずつ表示");
		for (String element : list) {
			System.out.println(element);
		}
	}
}