package runner;

import model.Employee;
import model.comparator.EmployeeBirthdayComparator;
import preparer.EmployeePreparer;
import util.EvenAndOddIdEmployeeMaps;

import java.util.List;

public class ApplicationRunner {
    public static void run() {
        EmployeePreparer preparator = new EmployeePreparer();
        List<Employee> employeeList = preparator.getEmployees();
        System.out.println("Отсортированный список по дате рождения по убыванию:");
        employeeList.sort(new EmployeeBirthdayComparator());
        System.out.println(employeeList + "\n");

        EvenAndOddIdEmployeeMaps evenAndOddIdEmployeeMaps = new EvenAndOddIdEmployeeMaps(employeeList);
        System.out.println("Even id Employees map : \n" + evenAndOddIdEmployeeMaps.getEvenIdEmployees());
        System.out.println();
        System.out.println("Odd id Employees map : \n" + evenAndOddIdEmployeeMaps.getOddIdEmployees());
    }
}
