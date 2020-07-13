public class Hero9_11 {
  String name;
  int hp;
  int mp;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero9_11(String name, int hp, int mp) {
    this.hp = hp;
    this.mp = mp;
    this.name = name;    // 引数の値でnameフィールドを初期化
  }
}
