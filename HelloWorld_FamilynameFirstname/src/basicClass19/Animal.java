package basicClass19;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog("犬");
		System.out.println("動物の名前: " + dog1.getName());
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(1);
		System.out.println("動物の数: " + dog2.getNumber());
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		java.util.Date date = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd H:m:s");
		String formattedDate = sdf.format(date);
		System.out.println("現在の日時: " + formattedDate);
	}
}

