package answer.ex_enum;

public class Main {

	public static void main(String[] args) {
		
		Month julyEnum = Month.of(7);
		System.out.println(julyEnum.getJapanese());
		System.out.println(julyEnum.getDescription());
		System.out.println(julyEnum.getEvent());
		
		Month decemberEnum = Month.of(12);
		System.out.println(decemberEnum.getJapanese());
		System.out.println(decemberEnum.getDescription());
		System.out.println(decemberEnum.getEvent());
		
	}

}
