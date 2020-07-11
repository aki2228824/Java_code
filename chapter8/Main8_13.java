public class Main8_13 {
    public static void main(String[] args) {
        Hero8_8 h = new Hero8_8();
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました!");
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }
}