package singleton.doublechecklocking;

public class Singleton {

    // the private reference to the one and only instance
    // volatile is to synchronize the variable instead of the method.
    private volatile static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;


    // Private Constructor so no Client can instantiate it
    private Singleton() {
    }

    // No synchronize in the method
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { // we only synchronize the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }

        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
