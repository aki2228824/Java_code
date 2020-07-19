public class Computer11_practice extends TangibleAsset11_practice {
  String makerName;
  // コンストラクタ
  public Computer(String name, int price, String color, String makerName) {
  super(name, price, color);
  this.makerName = makerName;
  }
  // メソッド
  public String getMakerName() {
    return this.makerName;
    }
}
