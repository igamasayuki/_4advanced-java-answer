package com.example.sample.exam_enum;

/**
 * 自転車を表すクラスです.
 * 
 * @author igamasayuki
 *
 */
public class Bicycle {
	
	/** 自転車が向いている方向 */
	private String bearing;

	/**
	 * 自転車の方向を定めます.
	 * 
	 * @param bearing これから向く方向
	 */
	public void setBearing(String bearing) {
		this.bearing = bearing;
	}
	
	/**
	 * 左へ曲がります.<br>
	 * 向いている方向が変わります。<br>
	 * 曲がった後、向いている方角を表示します。
	 */
	public void turnLeft() {
		Direction direction = Direction.of(bearing);
		this.bearing = direction.getLeftDirection();
		System.out.println("左へ曲がったので" + this.bearing + "を向きました");
	}
	
	/**
	 * 右へ曲がります.<br>
	 * 向いている方向が変わります。<br>
	 * 曲がった後、向いている方角を表示します。
	 */
	public void turnRight() {
		Direction direction = Direction.of(bearing);
		this.bearing = direction.getRightDirection();
		System.out.println("右へ曲がったので" + this.bearing + "を向きました");
	}
	
	/**
	 * 向いている方向を表示します.
	 */
	public void display() {
		System.out.println(bearing);
	}
}
