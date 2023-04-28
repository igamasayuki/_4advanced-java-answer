package answer;

public class Calculation {
	public static int execute(int firstNum, char operator, int secondNum) {
		int answer = 0;
		if (operator == '＋') {
			answer = firstNum + secondNum;
		} else if (operator == '－') {
			answer = firstNum - secondNum;
		} else if (operator == '×') {
			answer = firstNum * secondNum;
		} else if (operator == '÷') {
			answer = firstNum / secondNum;
		} else {
			throw new ArithmeticException();
		}
		return answer;
	};
}
