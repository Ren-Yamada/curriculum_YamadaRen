public class Person {
	// クラス変数の定義（人数をカウントするための変数）
	private static int count = 0;

	// インスタンスフィールドの定義
	private String name;
	private int age;
	private double height;
	private double weight;

	// 引数付きコンストラクタ
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // インスタンスが作成されるたびに人数をカウントアップ
	}

	// ゲッターメソッドとセッターメソッド
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	// BMIを計算して返すインスタンスメソッド
	double bmi() {
		// BMI = 体重(kg) / 身長(m)の二乗
		return Double.parseDouble(String.format ("%.1f",(double)((int)( this.weight / this.height / this.height))));

	}

	// インスタンス情報を出力するインスタンスメソッド
	public void print() {
	    
	    System.out.println(this.age);
	    System.out.println(this.height);
	    
	    System.out.println();
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "才です");
	    System.out.println("BMIは" + String.format("%.1f", bmi()) + "です");
	    System.out.println();
	    System.out.println("合計" + count + "人です");
	}
}