package sample.exam_api;

public class ObjectSample1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(100);
		car.setBodyColor("yello");
		System.out.println(car); // ←CarオブジェクトのtoString()が呼ばれる
	}
}
