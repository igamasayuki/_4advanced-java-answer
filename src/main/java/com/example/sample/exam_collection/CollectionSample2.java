package com.example.sample.exam_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample2 {
	public static void main(String[] args) {
		// ArrayListを生成
		List<Triathlon> list = new ArrayList<>();
		// Triathlonオブジェクトに要素を追加
		list.add(new Triathlon("スプリント", 0.75, 20.0, 5.0));
		list.add(new Triathlon("スタンダード", 1.5, 40.0, 10.0));
		list.add(new Triathlon("アイアンマン70.3", 1.9, 90.0, 21.0975));
		list.add(new Triathlon("アイアンマン", 3.8, 180.0, 42.195));

		System.out.println("通常のfor文を使用してArrayList内の要素を一つずつ表示");
		for (int i = 0; i < list.size(); i++) {
			Triathlon triathlon = list.get(i);
			System.out.println(triathlon); // ←TriathlonオブジェクトのtoString()が呼ばれる
		}

		System.out.println("拡張for文を使用してArrayList内の要素を一つずつ表示");
		for (Triathlon triathlon : list) {
			System.out.println(triathlon); // ←TriathlonオブジェクトのtoString()が呼ばれる
		}
	}
}