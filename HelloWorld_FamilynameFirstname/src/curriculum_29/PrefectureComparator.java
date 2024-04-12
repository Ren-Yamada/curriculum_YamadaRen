package curriculum_29;

import java.util.Comparator;

public class PrefectureComparator implements Comparator<Prefecture> {
    private boolean ascendingOrder;

    // コンストラクター
    public PrefectureComparator(boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    // 比較メソッド
    @Override
    public int compare(Prefecture p1, Prefecture p2) {
        if (ascendingOrder) {
            return Integer.compare(p1.getId(), p2.getId());
        } else {
            return Integer.compare(p2.getId(), p1.getId());
        }
    }
}
