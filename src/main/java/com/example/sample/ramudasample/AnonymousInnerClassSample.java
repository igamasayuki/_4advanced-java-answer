package com.example.sample.ramudasample;

/**
 * 匿名クラスを使用したサンプル.<br>
 * インターフェースの実装を定義せずに、匿名クラスとしてインスタンス化<br>
 * 匿名クラス・・・その場限りの実装クラス
 * @author igamasayuki
 *
 */
public class AnonymousInnerClassSample {

	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication(){
			@Override
			public int multi(int num1, int num2) {
				return num1 * num2;
			}
		};
		int answer = multiplication.multi(3, 4);
		System.out.println(answer);
	}

}


