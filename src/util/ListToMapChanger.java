package util;

import model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapChanger {
    public static Map<Integer, Employee> changeEmployeeListToEvenIdEmployeeMap(List<Employee> employeeList) {
        Map<Integer, Employee> evenIdEmployees = new HashMap<>();
        for (Employee employee : employeeList) {
            if (employee.getId() % 2 == 0) {
                evenIdEmployees.put(employee.getId(), employee);
            }
        }
        return evenIdEmployees;
    }

    public static Map<Integer, Employee> changeEmployeeListToOddIdEmployeeMap(List<Employee> employeeList) {
        Map<Integer, Employee> oddIdEmployees = new HashMap<>();
        for (Employee employee : employeeList) {
            if (employee.getId() % 2 != 0) {
                oddIdEmployees.put(employee.getId(), employee);
            }
        }
        return oddIdEmployees;
    }
}
