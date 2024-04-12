package curriculum_29;

public class Prefecture {
    private int id;
    private String name;
    private String city;
    private int population;
    private double area;

    // コンストラクター
    public Prefecture(int id, String name, String city, int population, double area) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.population = population;
        this.area = area;
    }

    // IDを取得するメソッド
    public int getId() {
        return id;
    }

    // 都道府県名を取得するメソッド
    public String getName() {
        return name;
    }

    // 県庁所在地を取得するメソッド
    public String getCity() {
        return city;
    }

    // 人口を取得するメソッド
    public int getPopulation() {
        return population;
    }

    // 面積を取得するメソッド
    public double getArea() {
        return area;
    }

    // 文字列形式で都道府県情報を取得するメソッド
    @Override
    public String toString() {
        return name + ":" + city + ":" + population;
    }
}
