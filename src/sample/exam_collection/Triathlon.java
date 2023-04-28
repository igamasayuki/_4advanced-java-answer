package sample.exam_collection;

public class Triathlon {
	// フィールド
	private String name;
	private double swim;
	private double bike;
	private double run;
	// 引数なしコンストラクタ
	public Triathlon() {}
	// 引数ありコンストラクタ
	public Triathlon(String name, double swim, double bike, double run) {
		this.name = name;
		this.swim = swim;
		this.bike = bike;
		this.run = run;
	}
	// toString() 
	@Override
	public String toString() {
		return "Triathlon [name=" + name + ", swim=" + swim + ", bike=" + bike + ", run=" + run + "]";
	}
	// 以下、Getter/Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSwim() {
		return swim;
	}
	public void setSwim(double swim) {
		this.swim = swim;
	}
	public double getBike() {
		return bike;
	}
	public void setBike(double bike) {
		this.bike = bike;
	}
	public double getRun() {
		return run;
	}
	public void setRun(double run) {
		this.run = run;
	}
}
