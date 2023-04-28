package answer.ex_shopcart;

/**
 * 商品を表すクラス.
 * 
 * @author igamasayuki
 *
 */
public class Item {
	/** 商品名 */
	private String name;
	/** 値段 */
	private Integer price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
