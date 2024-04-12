package curriculum_B;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         System.out.println("商品を入力してください：");
         String input = scanner.nextLine();

         String[] items = input.split("、");

         for (String item : items) {
             switch (item) {
                 case "テレビ":
                 case "ディスプレイ":
                     int remaining = (item.equals("テレビ")) ? (int) (Math.random() * 12) : 11 - (int) (Math.random() * 12);
                     System.out.println(item + "の残り台数は" + remaining + "台です");
                     break;
                 case "パソコン":
                 case "冷蔵庫":
                 case "扇風機":
                 case "洗濯機":
                 case "加湿器":
                     System.out.println(item + "の残り台数は" + (int) (Math.random() * 12) + "台です");
                     break;
                 default:
                     System.out.println("『" + item + "』は指定の商品ではありません");
                     break;
             }
         }
     }
 }