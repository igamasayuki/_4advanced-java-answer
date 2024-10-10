package com.example.ex_full_review_answer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * ホームラン＆ヒットゲーム.<br>
 * 3桁の数値を当てるゲーム
 * 
 * @author igamasayuki
 *
 */
public class Ex13 {

	public static void main(String[] args) throws IOException {
		int random1, random2, random3;

		Scanner scanner = new Scanner(System.in);// 入力バッファ準備
		Random random = new Random();

		random1 = random.nextInt(10);// 1つ目の乱数生成(0〜9の乱数)

		do {
			random2 = random.nextInt(10);// 2つ目の乱数生成(0〜9の乱数)
		} while (random1 == random2);// 重複した場合、生成しなおす

		do {
			random3 = random.nextInt(10);// 3つ目の乱数生成(0〜9の乱数)
		} while (random3 == random1 || random3 == random2);// 重複した場合、生成しなおす

		/* 乱数3つをそれぞれハッシュマップに入れる */
		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, random1);
		map.put(2, random2);
		map.put(3, random3);

		/* ここからゲームスタート */
		int input = 1;
		int homerun = 1;
		int hit = 1;
		int time = 1;
		System.out.println("プレーボール！");
		while (true) {
			homerun = 0;
			hit = 0;
			System.out.println("---" + time + "回目---");
			for (int i = 1; i <= 3; i++) {
				System.out.print(i + "個目:");
				input = Integer.parseInt(scanner.nextLine());// ユーザが入力。ただしユーザが連続して同じ数字を入力しないことを前提に作っています。
				Set<Integer> keySet = map.keySet();
				for (Integer key : keySet) {
					Integer value = map.get(key);
					if (value == input) { // 入力した数がハッシュマップの値と一致しているか
						if (key == i) {
							homerun++;
						} else {
							hit++;
						}
					}
				}
			}
			System.out.println(homerun + "ホームラン" + hit + "ヒット");
			if (homerun == 3) {
				// ホームラン3回出たら終了
				scanner.close(); // Scannerオブジェクトは使い終わったらメモリを解放しなければならない
				break;
			}
			time++;
		}
		System.out.println("正解は" + map.get(1) + ":" + map.get(2) + ":" + map.get(3) + "でした。");
		System.out.println("ゲーム終了");

	}

}
