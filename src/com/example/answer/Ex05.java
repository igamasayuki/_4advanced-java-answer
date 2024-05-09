package com.example.answer;

public class Ex05 {

	public static void main(String[] args) {
		String bigNumber = "阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量大数(むりょうたいすう)";
		String[] units = bigNumber.split(":");
		
		for(String unit : units) {
			System.out.println(unit);
		}
	}
}
