package curriculum_B;

public class Qes5 {
	 public static void main(String[] args) {
	        // 九九の表と計算式を表示する
	        for (int j = 1; j <= 9; j++) {
	            // 各段の掛け算を横に表示
	            for (int i = 1; i <= 9; i++) {
	                // 数字と計算式を 001、002 の形式で表示する
	                String left = String.format("%03d", i);
	                String right = String.format("%03d", j);
	                String result = String.format("%03d", i * j);
	                System.out.print(left + " × " + right + " = " + result + "\t");
	            }
	            // 段の終わりで改行せず、次の計算式を表示
	            System.out.println();
	        }
	    }
	}