package curriculum_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください"); // コンソールに文字を入力するよう指示
        String input = scanner.nextLine();

        String[] animalsData = input.split(",");
        for (String animalData : animalsData) {
            String[] parts = animalData.split(":");
            String name = parts[0];
            double length = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);
            String scientificName = getScientificName(name); // 動物名から学名を取得
            Animal animal = new Animal(name, length, speed, scientificName);
            animal.displayInfo(); // 動物の情報を表示
        }
    }

    public static String getScientificName(String animalName) {
        switch (animalName) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            case "インコ":
                return "不明";
            default:
                return "不明";
        }
    }
}
