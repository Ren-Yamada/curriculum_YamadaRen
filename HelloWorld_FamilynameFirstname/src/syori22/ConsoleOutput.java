// ConsoleOutput.javaファイル
package syori22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleOutput {
    // フィールドの宣言
    private String greeting;
    private String sushiDescription;
    private String cuisineType;
    private String currentDate;

    // コンストラクタ
    public ConsoleOutput() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiDescription = "この寿司はうまい";
        this.cuisineType = "寿司は和食です";
        this.currentDate = getCurrentDateTime();
    }

    // 日時を取得するメソッド
    private String getCurrentDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

    // コンソールに出力するメソッド
    public void printConsoleOutput() {
        System.out.println(this.greeting);
        System.out.println(this.sushiDescription);
        System.out.println(this.cuisineType);
        System.out.println("今の現在日時は" + this.currentDate + "です");
    }
}
