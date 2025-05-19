package com.example.sample.ramudasample;

/**
 * 通常のサンプル.<br>
 * インターフェースを実装し、実装したクラスをインスタンス化して利用する。
 * @author igamasayuki
 *
 */
public class NomalSample {

	public static void main(String[] args) {
		Multiplication multiplication = new MultiplicationImpl();
		int answer = multiplication.multi(3, 4);
		System.out.println(answer);
	}

}


class MultiplicationImpl implements Multiplication{
	@Override
	public int multi(int num1, int num2) {
		return num1 * num2;
	}
}