package com.example.sample.ramudasample;

/**
 * ラムダ式を使用したサンプル.<br>
 * Java8から導入されたラムダ式を使用したサンプル<br>
 * @author igamasayuki
 *
 */
public class LambdaSample2 {

	public static void main(String[] args) {
		// 処理が1行の処理であれば、{}やreturnを省略することができる
		Multiplication multiplication = (num1, num2) -> num1 * num2;
		
		int answer = multiplication.multi(3, 4);
		System.out.println(answer);
	}
}

