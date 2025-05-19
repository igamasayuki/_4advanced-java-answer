package com.example.sample.ramudasample;

/**
 * ラムダ式を使用したサンプル.<br>
 * Java8から導入されたラムダ式を使用したサンプル<br>
 * @author igamasayuki
 *
 */
public class LambdaSample {

	public static void main(String[] args) {
		// ラムダ式 実装メソッドが１つだけの関数型インターフェースの実装を簡略化できる。
		// multi()メソッドの実装をラムダ式を使って行っている
		// メソッド名と引数の型が省略されている (引数の型は記述することができる)
		Multiplication multiplication = (num1, num2) -> {
			return num1 * num2;
		};
		
		int answer = multiplication.multi(3, 4);
		System.out.println(answer);
	}
}

