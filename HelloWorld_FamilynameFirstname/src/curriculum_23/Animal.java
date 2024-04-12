package curriculum_23;

public class Animal {
	private String animalName;
	private double bodyLength;
	private double speed;

	// ゲッターメソッド
	public String getAnimalName() {
		return this.animalName;
	}

	public double getBodyLength() {
		return this.bodyLength;
	}

	public double getSpeed() {
		return this.speed;
	}

	// セッターメソッド
	public void setAnimalName(String name) {
		this.animalName = name;
	}

	public void setBodyLength(double length) {
		this.bodyLength = length;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {
		Animal lion = new Animal();

		// フィールドに値をセット
		lion.setAnimalName("ライオン");
		lion.setBodyLength(2.1);
		lion.setSpeed(80);

		// コンソールに出力
		System.out.println("動物名：" + lion.getAnimalName());
		System.out.println("体長：" + lion.getBodyLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
