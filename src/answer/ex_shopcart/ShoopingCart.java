package answer.ex_shopcart;

import java.util.ArrayList;
import java.util.List;

/**
 * ショッピングカートを表すクラス. 
 * Listオブジェクトをフィールドに持たせます。
 * 
 * @author igamasayuki
 *
 */
public class ShoopingCart {

	/** 商品を入れるリスト */
	private List<Item> itemList;

	/**
	 * コンストラクタ.
	 */
	public ShoopingCart() {
		itemList = new ArrayList<Item>();
	}

	/**
	 * 商品を追加する.
	 * 
	 * @param item 商品
	 */
	public void addItem(Item item) {
		itemList.add(item);
	}

	/**
	 * 商品数を取得する.
	 * 
	 * @return 商品数
	 */
	public int getItemSize() {
		return itemList.size();
	}

	/**
	 * 商品の合計金額を取得する.
	 * 
	 * @return 商品の合計金額
	 */
	public int getTotalPrice() {
		int totalPrice = 0;
		for (Item item : itemList) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

	/**
	 * 商品の平均金額を取得する.
	 * 
	 * @return 商品の平均金額
	 */
	public double getAverage() {
		return getTotalPrice() / getItemSize();
	}

	/**
	 * 商品を削除する.
	 * 
	 * @param index 削除したい商品のindex(添字)番号
	 */
	public void removeItem(int index) {
		itemList.remove(index);
	}

	// 以下、Getter/Setter

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}
