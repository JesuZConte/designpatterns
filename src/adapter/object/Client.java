package adapter.object;

public class Client {

    public static void main(String[] args) {
        Duck duck = new MallarDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe turkey as a duck says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
