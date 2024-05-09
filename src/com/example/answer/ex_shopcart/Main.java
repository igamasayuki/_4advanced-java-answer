package com.example.answer.ex_shopcart;

public class Main {

	public static void main(String[] args) {
		ShoopingCart shoopingCart = new ShoopingCart();

		Book book1 = new Book();
		book1.setName("本１");
		book1.setPrice(1000);
		shoopingCart.addItem(book1);

		Book book2 = new Book();
		book2.setName("本2");
		book2.setPrice(2000);
		shoopingCart.addItem(book2);

		CD cd1 = new CD();
		cd1.setName("CD1");
		cd1.setPrice(1000);
		shoopingCart.addItem(cd1);

		CD cd2 = new CD();
		cd2.setName("CD2");
		cd2.setPrice(2000);
		shoopingCart.addItem(cd2);

		CD cd3 = new CD();
		cd3.setName("CD3");
		cd3.setPrice(3000);
		shoopingCart.addItem(cd3);

		DVD dvd = new DVD();
		dvd.setName("DVD1");
		dvd.setPrice(4000);
		shoopingCart.addItem(dvd);

		System.out.println("カートの中の商品数: " + shoopingCart.getItemSize());
		System.out.println("カートの合計金額: " + shoopingCart.getTotalPrice());
		System.out.println("カートの平均金額: " + shoopingCart.getAverage());
	}
}