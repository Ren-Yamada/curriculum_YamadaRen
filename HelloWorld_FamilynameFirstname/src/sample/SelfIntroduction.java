package sample;

public class SelfIntroduction {


	public static void main(String[] args) {
		
		// 氏名
		String name = "山田 花子";
		
		// 年齢
		int age = 25;
		
		// 映画鑑賞
		String hobby = "映画鑑賞";
		
		/*
		 * 自己紹介文を出力する処理
		 */
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("趣味は" + hobby + "です。");
		
		method1();
		
		method2();
		
	}

	private static void method2() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public static String method1() {
		return "山田";
	}

}
