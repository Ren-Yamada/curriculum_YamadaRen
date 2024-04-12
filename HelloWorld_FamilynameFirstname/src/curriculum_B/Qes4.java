package curriculum_B;

public class Qes4 {
    public static void main(String[] args) {
        // 九九の表と計算式を表示する
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // 計算式と計算結果を表示
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            // 改行
            System.out.println();
        }
    }
}
