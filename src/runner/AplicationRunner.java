package runner;

import model.Employee;
import model.comparator.EmployeeBirthdayComparator;
import preparer.impl.EmployeePreparer;
import util.ListToMapConverterById;

import java.util.List;
import java.util.Map;

public class AplicationRunner {
    public static void run() {
        EmployeePreparer preparator = new EmployeePreparer();
        List<Employee> employeeList = preparator.getEmployees();
        System.out.println("Отсортированный список по дате рождения по убыванию:");
        employeeList.sort(new EmployeeBirthdayComparator());
        System.out.println(employeeList + "\n");

        Map<Integer, Employee> evenIdEmployees = ListToMapConverterById
                .changeEmployeeListToEvenIdEmployeeMap(employeeList);
        Map<Integer, Employee> oddIdEmployees = ListToMapConverterById
                .changeEmployeeListToOddIdEmployeeMap(employeeList);

        System.out.println("Even id Employees map : \n" + evenIdEmployees);
        System.out.println();
        System.out.println("Odd id Employees map : \n" + oddIdEmployees);
    }
}
