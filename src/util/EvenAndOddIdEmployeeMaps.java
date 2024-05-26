package util;

import model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenAndOddIdEmployeeMaps {
    private final Map<Integer, Employee> evenIdEmployees;
    private final Map<Integer, Employee> oddIdEmployees;

    public EvenAndOddIdEmployeeMaps(List<Employee> employeeList) {
        this.evenIdEmployees = new HashMap<>();
        this.oddIdEmployees = new HashMap<>();
        for (Employee employee : employeeList) {
            if (employee.getId() % 2 == 0) {
                this.evenIdEmployees.put(employee.getId(), employee);
            } else{
                this.oddIdEmployees.put(employee.getId(), employee);
            }
        }
    }

    public Map<Integer, Employee> getEvenIdEmployees() {
        return evenIdEmployees;
    }

    public Map<Integer, Employee> getOddIdEmployees() {
        return oddIdEmployees;
    }
}
