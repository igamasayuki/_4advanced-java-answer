package answer;

public class Ex12 {

	public static void main(String[] args) {
		try {
			int answer = 10 / 0;
			System.out.println(answer);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0で割ることはできません。");
		}
	}

}
