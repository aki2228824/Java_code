public class Main5_3 {
    public static void email(String address,String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }
    public static void main(String[] args) {
        String address = "xxx@.com";
        String text = "明日は13時によろしくお願い致します。";
        email(address, text);
    }
}