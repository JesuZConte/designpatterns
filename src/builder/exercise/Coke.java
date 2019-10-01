package builder.exercise;

public class Coke extends Drink {
    private float price;
    private String name;

    public Coke() {
        this.price = 5;
        this.name = "Coke";
    }

    @Override
    public String toString() {
        return "Coke{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
