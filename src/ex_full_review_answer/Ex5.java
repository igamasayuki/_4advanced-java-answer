package ex_full_review_answer;

/**
 * フィボナッチ数列を表示.<br>
 * 1000以上超えた場合、計算を打ち切る
 * 
 * @author igamasayuki
 *
 */
public class Ex5 {
	public static void main2(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int answer = 0;
		System.out.print(num1 + num2 + " "); // 最初の0と1を表示
		while (true) {
			answer = num1 + num2;
			if (answer > 1000) { // 答えが1000を超えたらループを抜ける
				break;
			}
			System.out.print(answer + " ");
			num1 = num2;
			num2 = answer;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; true; i++) {
			int answer = fibonacci(i);
			if (answer > 1000) { // 答えが1000を超えたらループを抜ける
				break;
			}
			System.out.print(answer + " ");
		}
	}

	static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}
}
