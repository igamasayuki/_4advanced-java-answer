package sample.exam_enum;

/**
 * 曜日を表す列挙型.
 */
public enum DayOfWeek { // ←定数をまとめたクラスのようなもの
	// 定数一覧、DayOfWeekのコンストラクタを使用して定数に値を持たせている
	SUNDAY("日", 1, "最初の曜日です。基本的にお休みです。"),
	MONDAY("月", 2, "2番目の曜日です。"), 
	TUESDAY("火", 3, "3番目の曜日です。"),
	WEDNESDAY("水", 4, "4番目の曜日です。週の中日。"), 
	THURSDAY("木", 5, "5番目の曜日です。"), 
	FRIDAY("金", 6, "6番目の曜日です。明日は休みです。"),
	SATURDAY("土", 7, "最後の曜日です。基本的にお休みです。"),
	; // ←定数一覧終わり(以降、定数の中身の定義)

	// 定数オブジェクトに含めるフィールド、コンストラクタ、メソッドを定義
	/** key値 */
	private final String key;
	/** value値 */
	private final int value;
	/** 定数に含める他の値 */
	private final String comment;

	/**
	 * コンストラクタ.
	 */
	private DayOfWeek(final String key, final int value, final String comment) {
		this.key = key;
		this.value = value;
		this.comment = comment;
	}

	/**
	 * 定数に含まれるvalue値を返します.
	 * 
	 * @return value値
	 */
	public int getValue() {
		return value;
	}

	/**
	 * 定数に含まれるkey値を返します.
	 * 
	 * @return key値
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 定数に含まれるコメントを返します.
	 * 
	 * @return コメント
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 日本語曜日名からenumを取得.
	 * 
	 * @param key 日本語曜日名
	 * @return 渡された曜日を含むenum
	 */
	public static DayOfWeek of(String key) {
		for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
			if (dayOfWeek.key.equals(key)) {
				return dayOfWeek;
			}
		}
		throw new IndexOutOfBoundsException("The value of day of week doesn't exist.");
	}
}
