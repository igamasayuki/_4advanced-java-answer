package com.example.sample.ramudasample;

/**
 * 掛け算を行う　関数型インターフェース.<br>
 * 関数型インタフェースとは1つのインターフェースに実装が必要なメソッドを1つだけ持つインターフェースの事です。
 * http://www.casleyconsulting.co.jp/blog-engineer/java/%E4%BB%8A%E6%9B%B4%E8%81%9E%E3%81%91%E3%81%AA%E3%81%84%EF%BC%9Fjava8%E3%81%AE%E3%83%A9%E3%83%A0%E3%83%80%E5%BC%8F/
 * @author igamasayuki
 *
 */
@FunctionalInterface
public interface Multiplication {

	 /**
	  * 掛け算を行う.
	 * @param num1　掛けられる数
	 * @param num2　掛ける数
	 * @return 掛け算結果
	 */
	public abstract int multi(int num1, int num2);
	 
}