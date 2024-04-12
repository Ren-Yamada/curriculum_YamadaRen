package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     // 生徒の人数の入力とバリデーション
        int numStudents;
        while (true) {
            try {
                System.out.print("生徒の人数を入力してください（2以上）: ");
                numStudents = Integer.parseInt(scanner.nextLine());
                if (numStudents < 2) {
                    System.out.println("生徒の人数は2以上でなければなりません。");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("正しい数値を入力してください。");
            }
        }

        String[] subjects = {"英語", "数学", "理科", "社会"};
        double[][] scores = new double[numStudents][subjects.length];
        double[] totalScores = new double[subjects.length];
        double[] studentsAvg = new double[numStudents];

     // 各生徒の成績の入力とバリデーション
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < subjects.length; j++) {
                while (true) {
                    try {
                        System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください: ");
                        scores[i][j] = Double.parseDouble(scanner.nextLine());
                        if (scores[i][j] < 0) {
                            System.out.println("正しい点数を入力してください。");
                            continue;
                        }
                        totalScores[j] += scores[i][j];
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("正しい数値を入力してください。");
                    }
                }
            }
            System.out.println(); // 改行を追加
        }

        // 各生徒の平均点を計算
        for (int i = 0; i < numStudents; i++) {
            double studentTotal = 0;
            for (int j = 0; j < subjects.length; j++) {
                studentTotal += scores[i][j];
            }
            studentsAvg[i] = studentTotal / subjects.length;
            System.out.printf("%d人目の平均点は%.2f点です。\n\n", (i + 1), studentsAvg[i]); // 改行を追加
        }

        // 各科目の平均点を計算
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%sの平均点は%.2f点です。\n\n", subjects[i], totalScores[i] / numStudents); // 改行を追加
        }

        // 全体の平均点を計算
        double totalAvg = 0;
        for (double avg : studentsAvg) {
            totalAvg += avg;
        }
        totalAvg /= numStudents;
        System.out.printf("全体の平均点は%.2f点です。\n", totalAvg);
    }
}
