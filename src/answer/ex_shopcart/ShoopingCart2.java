package answer.ex_shopcart;

import java.util.ArrayList;

/**
 * ショッピングカートを表すクラス.
 * ArrayListを継承します。
 * 
 * @author igamasayuki
 *
 */
public class ShoopingCart2 extends ArrayList<Item>{

	/**
	 * Serializableインターフェースを実装したArrayListクラスを
	 * 継承する場合はこの１行を書かないと警告が出るため、
	 * Eclipseに自動で書かせる
	 */
    private static final long serialVersionUID = 1L;

    /**
     * 商品の合計金額を取得する.
     * 
     * @return 商品の合計金額
     */
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Item item : this) {
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
        return getTotalPrice() / size();
    }
}