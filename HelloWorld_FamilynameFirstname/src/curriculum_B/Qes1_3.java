package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザー名の入力
        System.out.print("ユーザー名を入力してください: ");
        String username = scanner.nextLine();

        // ユーザー名の入力チェック
        if (username == null || username.isEmpty()) {
            System.out.println("名前を入力してください");
        } else if (!username.matches("[a-zA-Z0-9]+")) {
            System.out.println("半角英数字のみで名前を入力してください");
        } else if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
            playRockPaperScissors(username);
        }
    }

    public static void playRockPaperScissors(String username) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalRounds = 0;

        System.out.println("じゃんけんを始めます！");

        while (true) {
            totalRounds++;
            System.out.println("\n--- Round " + totalRounds + " ---");

            // 自分の手の入力
            System.out.print(username + "の手を選んでください (0: グー, 1: チョキ, 2: パー): ");
            int userChoice = scanner.nextInt();

            // 相手の手のランダム選択
            int computerChoice = random.nextInt(3);

            // 手の文字列化
            String[] hands = {"グー", "チョキ", "パー"};

            // 結果の出力
            System.out.println(username + "の手は「" + hands[userChoice] + "」");
            System.out.println("相手の手は「" + hands[computerChoice] + "」");

            // 勝敗の判定
            if (userChoice == computerChoice) {
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((userChoice == 0 && computerChoice == 1) ||
                    (userChoice == 1 && computerChoice == 2) ||
                    (userChoice == 2 && computerChoice == 0)) {
                System.out.println("やるやん。\n次は俺にリベンジさせて");
                break;
            } else {
                System.out.println("俺の勝ち！");

                if (userChoice == 0) {
                    System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
                } else if (userChoice == 1) {
                    System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
                } else {
                    System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
                }
            }
        }

        System.out.println("勝つまでにかかった合計回数は" + totalRounds + "回です");
    }
}
