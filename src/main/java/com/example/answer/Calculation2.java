package com.example.answer;


public class Calculation2 {

	public static int execute(int firstNum, char operator, int secondNum) 
			throws OperatorException {
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
			throw new OperatorException("不正な演算子が使われました");
		}
		return answer;
	};
}
