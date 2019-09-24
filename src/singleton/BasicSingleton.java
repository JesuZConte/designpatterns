package singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value;

    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // this will solve the problem of serialization because it will
    // change the reference if we don't add this.
    protected Object readResolve() {
        return INSTANCE;
    }
}
