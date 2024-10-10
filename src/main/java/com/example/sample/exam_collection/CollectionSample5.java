package com.example.sample.exam_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// ArrayListにIntegerオブジェクトを格納
//		list.add(new Integer(10)); // int型からIntegerオブジェクトに変換
//		list.add(new Integer(20));
//		list.add(new Integer(30));
		// 拡張for文を使用して一つずつ表示
		for(Integer element : list) {
			int intElement  = element.intValue();
			System.out.println(intElement);
		}
	}
}
