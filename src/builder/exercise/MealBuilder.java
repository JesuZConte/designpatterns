package builder.exercise;

public class MealBuilder implements BuilderInterface {
    private Burger burger;
    private Drink drink;
    private Meal meal = new Meal();

    @Override
    public void addDrink(String type) {
        String drinkType = type.trim().toLowerCase();
        switch (drinkType) {
            case "coke": drink = new Coke();
                System.out.println("Added a Coke.");
            break;
            case "pepsi": drink = new Pepsi();
                System.out.println("Added a Pepsi.");
            break;
            default: drink = null;

        }
        meal.setDrink(drink);
    }

    @Override
    public void addBurger(String type) {
        String burgerType = type.trim().toLowerCase();
        switch (burgerType) {
            case "veg": burger = new VegBurger();
                System.out.println("Added Vegetarian Burger.");
                break;
            case "chicken": burger = new ChickenBurger();
                System.out.println("Added Chicken Burger.");
                break;
            default: burger = null;
        }
        meal.setBurger(burger);

    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
