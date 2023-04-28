package ex_full_review_answer;

/**
 * 1から100までを表示.
 * 
 * <pre>
 * 3の倍数なら"Fizz"、
 * 5の倍数なら"Buzz"、
 * 両方で割り切れるなら"FizzBuzz"を出力する
 * </pre>
 * 
 * @author igamasayuki
 *
 */
public class Ex2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
