public class Main {
    public static void main(String[] args) {
        // 引数にweightの値を指定してPersonクラスのインスタンスを作成
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
       
        // ゲッターメソッドを使って情報を表示
        System.out.println(person1.getName());
        

        // インスタンス情報を出力
        person1.print();
    }
}
