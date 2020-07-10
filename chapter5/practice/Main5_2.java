public class Main5_2 {
    public static void email(String address, String title, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
    public static void main(String[] args) {
        String address = "xxx@.com";
        String title = "開発の件";
        String text = "明日は13時によろしくお願い致します。";
        email(address, title, text);
    }
}