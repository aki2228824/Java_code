public class PoisonMatango extends Matango {
    int poison = 5;
    public void attack(hero h) {
        super.attack(h);
        if(poison > 0) {
            System.out.println("さらに毒をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage
            System.out.println(damage  + "ポイントのダメージ！");
            this.poison--;
            }
        }
    }
}
