package com.example.ex_full_review_answer;

/**
 * コマンドラインで受け取った数値をもとに九九表を作成.
 * 
 * @author igamasayuki
 *
 */
public class Ex7 {
	public static void main(String[] args) {
		int n = 7; // 任意の数値を入れる
		if (n < 1 || 20 < n) {
			System.out.println("1～20までの数字を入力してください");
			return;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int answer = i * j;

				if (answer < 100) {
					System.out.print(" ");// 10桁のときは空白を入れる
					if (answer < 10) {
						System.out.print(" "); // 1桁のときは空白を入れる
					}
				}
				System.out.print(answer + "  ");
			}
			System.out.println();
		}
	}

}
