package sample.exam_enum;

/**
 * 方角を表す列挙型.
 * 
 * @author igamasayuki
 *
 */
public enum Direction {
	
	EAST("東", "南", "北"),
	WEST("西",  "北", "南"),
	SOUTH("南", "西", "東"),
	NORTH("北", "東", "西"), 
	;

	/** 方角名 */
	private final String name;
	/** 右の方向 */
	private final String rightDirection;
	/** 左の方向 */
	private final String leftDirection;
	
	private Direction(final String name, final String rightDirection, String leftDirection) {
		this.name = name;
		this.rightDirection = rightDirection;
		this.leftDirection = leftDirection;
	}
	
	/**
	 * 日本語方角名からenumを取得.
	 * 
	 * @param name 日本語方角名
	 * @return 渡された方角を含むenum
	 */
	public static Direction of(String name) {
		for (Direction direction : Direction.values()) {
			if (direction.name.equals(name)) {
				return direction;
			}
		}
		throw new IndexOutOfBoundsException("The value of direction doesn't exist.");
	}

	// 以下、Getter
	public String getName() {
		return name;
	}

	public String getRightDirection() {
		return rightDirection;
	}

	public String getLeftDirection() {
		return leftDirection;
	}
	
}
