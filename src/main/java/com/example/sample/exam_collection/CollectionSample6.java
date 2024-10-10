package com.example.sample.exam_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// ArrayListにIntegerオブジェクトを格納
		// オートボクシングで自動的に変換(int→Integer)
		list.add(10); 
		list.add(20);
		list.add(30);
		// 拡張for文を使用して一つずつ表示
		// オートボクシングで自動的に変換(Integer→int)
		for(int intElement : list) { 
			System.out.println(intElement);
		}
	}
}
