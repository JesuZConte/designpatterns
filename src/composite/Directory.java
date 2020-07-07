package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IEmployee {
    private List<IEmployee> employees = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        for (IEmployee employee: employees) {
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }
}
