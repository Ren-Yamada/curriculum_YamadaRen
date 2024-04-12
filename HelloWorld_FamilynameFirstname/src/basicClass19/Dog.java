package basicClass19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String name;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	private int number;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog(String name) {
		this.name = name;
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int number) {
		this.number = number;
	}
	
	// Getterメソッド
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
}
