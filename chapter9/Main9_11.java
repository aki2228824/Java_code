public class Main9_11 {
  public static void main(String[] args) {
    Hero9_11 h = new Hero9_11(new java.util.Scanner(System.in).nextLine(), 300, 200);
    Thief t = new Thief("アサカ", 40, 5);
    
    System.out.println(h.name);
    System.out.println(h.hp);
    System.out.println(h.mp);
    System.out.println("名前は" + t.name);
    System.out.println("HPは" + t.hp);
    System.out.println("MPは" + t.mp);
    
  }
}
