// Character.java
package character25;

public class Character {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int agility;
    private int defense;

    public Character(String name, int hp, int mp, int attack, int agility, int defense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.agility = agility;
        this.defense = defense;
    }

    // Getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // Display character status
    public void displayStatus() {
        System.out.println("こんにちは " + name + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + attack);
        System.out.println("素早さ：" + agility);
        System.out.println("防御力：" + defense);
        System.out.println("\nさあ冒険に出かけよう！");
    }
}
