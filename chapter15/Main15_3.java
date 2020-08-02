public class Main15_3 {
    public static void main(String[] args) {
        String s1 = "Java Programming";
        System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
        System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));
        System.out.println("前後の言葉を入れ替えると" + s1.replace("Programming", "Java"));
        System.out.println("文字の大きさを変換すると" + s1.toUpperCase() + "です");
    }
}