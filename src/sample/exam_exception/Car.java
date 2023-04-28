package sample.exam_exception;

public class Car {

	private int speed;

	public void stepOnAccele() throws Exception {
		speed += 10;
		if (speed >= 120) {
			// 120以上になったら例外を発生させる
			throw new Exception();
		}
	}

}
