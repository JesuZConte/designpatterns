package singleton.billpughe;

public class Singleton {

    // an instance attribute
    private int data = 0;


    // Private Constructor so no Client can instantiate it
    private Singleton() {
    }

    private static class SingletonHelper {
        // Nested class is referenced after getInstance() is called
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
