package ex_full_review_answer;

/**
 * 1から100までの総和を求めます.
 * 
 * @author igamasayuki
 *
 */
public class Ex1 {
	public static void main(String[] args) {
		int answer = 0;
		for (int i = 1; i <= 100; i++) {
			answer = answer + i;
		}
		System.out.println(answer);
	}
}
