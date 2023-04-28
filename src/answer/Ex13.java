package answer;

public class Ex13 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.NotExistClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("クラスが見つかりません");
		}
	}

}
