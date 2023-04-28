package ex_full_review_answer;

/**
 * FizzBuuzzメソッドを作り、mainメソッドで呼び出す.<br>
 * FizzBuzzメソッドは課題2と同じ機能を持ち、 mainメソッドはFizzBuzzメソッドを呼び出す
 * 
 * @author igamasayuki
 *
 */
public class Ex3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String result = fizzBuzz(i);
			System.out.println(result);
		}
	}

	/**
	 * FizzBuzzを実現するメソッド.
	 * 
	 * @param num 判定する数値
	 * @return 3で割り切れるなら“Fizz”、5で割り切れるなら“Buzz”、両方で割り切れるなら“FizzBuzz”
	 *         を戻り値として返します。それ以外は数値を文字列に変換して返します。
	 */
	static String fizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 == 0) {
			return "Buzz";
		} else {
//			return String.valueOf(i); // intをStringに変換
			return num + ""; // わからなければこれでもOK
		}
	}

}
