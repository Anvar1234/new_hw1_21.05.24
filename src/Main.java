import model.Employee;
import model.comparator.EmployeeBirthdayComparator;
import preparer.impl.EmployeePreparer;
import util.ListToMapChanger;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeePreparer preparator = new EmployeePreparer();
        List<Employee> employeeList = preparator.getEmployees();
        Collections.sort(employeeList, new EmployeeBirthdayComparator());

        System.out.println("employeeList : " + employeeList);

        Map<Integer, Employee> evenIdEmployees = ListToMapChanger.changeEmployeeListToEvenIdEmployeeMap(employeeList);
        Map<Integer, Employee> oddIdEmployees = ListToMapChanger.changeEmployeeListToOddIdEmployeeMap(employeeList);

        System.out.println("Even id Employees : " + evenIdEmployees);
        System.out.println("Odd id Employees : " + oddIdEmployees);
    }
}