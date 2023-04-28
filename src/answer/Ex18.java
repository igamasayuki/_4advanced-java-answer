package answer;
import java.util.ArrayList;
import java.util.List;

public class Ex18 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("伊賀");
		list.add("⼭田");
		list.add("佐藤");
		list.add("⽥中");
		for (String name : list) {
			System.out.println(name);
		}
	}
}
