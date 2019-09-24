package solid.liskovsubstitutionprinciple;

public abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();

    public static void main(String[] args) {

        // with both concrete classes we can call the abstract methods:

        Vehicle vehicle = new Bus();
        int busSpeed = vehicle.getSpeed();
        int busCubicCapacity = vehicle.getCubicCapacity();


        Vehicle vehicle1 = new Car();
        int carSpeed = vehicle1.getSpeed();
    }
}

class Car extends Vehicle {
    int getSpeed() { return 0; }
    int getCubicCapacity() { return 0; }
    boolean sHatchBack() { return false; }
}

class Bus extends Vehicle {
    int getSpeed() { return 0; }
    int getCubicCapacity() { return 0; }
    boolean getEmergencyExitLoc() { return false; }
}

