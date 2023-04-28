package ex_full_review_answer;

/**
 * 数字がかかれたカードからクラスを求める.<br>
 * 
 * <pre>
 * カード1～30⇒１クラス
 * カード31～60⇒2クラス
 * カード61～90⇒3クラス
 * 以後永遠に・・・
 * </pre>
 * 
 * @author igamasayuki
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		int cardNum = Integer.parseInt(args[0]);
		int classNum = cardNum / 30 + 1;

		if (cardNum % 30 == 0) {
			classNum = classNum - 1;
		}
		System.out.println(classNum);
	}

}
