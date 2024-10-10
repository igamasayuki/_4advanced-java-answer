package com.example.sample.exam_enum;

/**
 * 自転車を操作する実行用のクラス.
 * 
 * @author igamasayuki
 *
 */
public class BicycleMain {

	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle();
		// 北の方角を向きます
		bicycle.setBearing(Direction.NORTH.getName());
		// 左へ曲がります
		bicycle.turnLeft();
		// 右へ曲がります
		bicycle.turnRight();
		// 左へ曲がります
		bicycle.turnLeft();
		// 左へ曲がります
		bicycle.turnLeft();
		// 右へ曲がります
		bicycle.turnRight();
		// 左へ曲がります
		bicycle.turnLeft();
		// 向いている方向を表示します
		bicycle.display();
		
	}

}
