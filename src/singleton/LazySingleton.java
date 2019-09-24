package singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("initializing a lazy singleton");
    }

    // synchronized avoids that the instance is initialized twice
    // other option is to check first if it's null, then synchronized the class ( synchronized (LazySingleton.class) )
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
