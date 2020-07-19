public abstract class TangibleAsset11_practice extends Asset11_practice implements Things {
    String color;
    double weight;

    public TangibleAsset11_practice(String name, int price, String color) {
        super(name, price)
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}