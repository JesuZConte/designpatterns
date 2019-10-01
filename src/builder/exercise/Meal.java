package builder.exercise;

public class Meal {
    private Drink drink;
    private Burger burger;

    public Meal() {
    }

    public Meal(Drink drink, Burger burger) {
        this.drink = drink;
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "drink=" + drink +
                ", burger=" + burger +
                '}';
    }
}
