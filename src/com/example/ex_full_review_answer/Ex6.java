package com.example.ex_full_review_answer;

/**
 * 九九足し算バージョン.
 * 
 * @author igamasayuki
 *
 */
public class Ex6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int answer = i + j;
				if (answer < 10) {
					System.out.print(" "); // 1桁のときは空白を入れる
				}
				System.out.print(answer + " ");
			}
			System.out.println();
		}
	}

}
