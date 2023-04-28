package answer;

public class Ex17 {
	public static void main(String[] args) {

		try {
			System.out.println(Calculation2.execute(4, '＋', 3));
			System.out.println(Calculation2.execute(8, '－', 4));
			System.out.println(Calculation2.execute(3, '×', 8));
			System.out.println(Calculation2.execute(5, '÷', 2));
			System.out.println(Calculation2.execute(5, '$', 2));
			
		} catch (OperatorException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
