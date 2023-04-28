package sample.exam_javadoc;

/**
 * 車を表すクラスです. <br>
 * トラックやスポーツカーを表現したい場合はこのクラスを継承してください。
 * 
 * @author igamasayuki
 */
public class Car {

	/** 走行速度 */
	private int speed;
	/** 所有者名 */
	private String owner;

	/**
	 * 走ります.
	 * 
	 * @param speed 追加するスピード
	 * @return 追加された後の現時点でのスピード
	 * @throws Exception スピードが120km/h以上になったら発生します
	 */
	public int run(int speed, String bodyColor) throws Exception {
		this.speed += speed;
		if (this.speed > 120) {
			throw new Exception("スピード出し過ぎです");
		}
		System.out.println("車が時速" + speed + "km/hで走っています。");
		return this.speed;
	}

	// 以後のGetterとSetterとtoStringにはJavadocコメントは不要
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", owner=" + owner + "]";
	}

}
