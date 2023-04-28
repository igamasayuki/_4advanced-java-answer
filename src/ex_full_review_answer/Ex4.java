package ex_full_review_answer;

/**
 * 四則演算を行うメソッド.<br>
 * 数字2つと演算子をcalcメソッドに渡して、演算結果をもらう
 * 
 * @author igamasayuki
 *
 */
public class Ex4 {

	/**
	 * メインメソッド.
	 * 
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		System.out.println("3+2=" + calc(3, 2, '+'));
		System.out.println("3-2=" + calc(3, 2, '-'));
		System.out.println("8/4=" + calc(8, 4, '/'));
		System.out.println("7&3=" + calc(7, 3, '&'));
	}

	/**
	 * 四則演算を行うメソッド.
	 * 
	 * @param num1 数字1
	 * @param num2 数字2
	 * @param code 演算子
	 * @return 演算結果
	 */
	private static int calc(int num1, int num2, char code) {
		if (code == '+') {
			return num1 + num2;
		} else if (code == '-') {
			return num1 - num2;
		} else if (code == '*') {
			return num1 * num2;
		} else if (code == '/') {
			return num1 / num2;
		} else {
			throw new ArithmeticException("演算子が不正です。");
		}
	}

	// switch文で実現した解答例
	public static int calc2(int num1, int num2, char code) {
		switch (code) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		default:
			throw new ArithmeticException("演算子が不正です。");
		}
	}

}
