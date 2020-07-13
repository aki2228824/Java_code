import java.util.*;

public class Clelic {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

  public void selfAid() {
      this.hp = this.MAX_HP;
      this.mp -= 5;
      System.out.println("selfAid！");
      System.out.println("MPを5消費しHPが最大まで回復した！");
    }

  public int pray(int sec){
      int correction = new java.util.Random().nextInt(3) + sec;
      int recover = Math.min(this.MAX_MP - this.mp, correction);
      this.mp += recover;
      System.out.println(this.name + "は" + sec + "秒間天に祈った！");
      System.out.println("MPが" + recover + "回復した！");
      return  recover;
    } 
}