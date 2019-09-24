package solid.singleresponsibilityprinciple;

import java.util.Date;

public class Employee {

    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;
    // getters / setters for all member variables



    // this other methods should be in their own classes that are responsible for this calculations, NOT in the Employee class
//    public boolean isPromotionDueThisYear() {
//        // promotion logic
//        return true;
//    }
//
//    public double calcIncomeTaxForCurrentYear() {
//        // income tax logic
//        return 1.0;
//    }


}
