package preparer;

import model.Employee;
import model.PossibleEmployee;
import util.DateConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeePreparer {
    private static final List<PossibleEmployee> possibleEmployee = getPossibleEmployee();
    private static List<PossibleEmployee> getPossibleEmployee() {
        return Arrays.asList(PossibleEmployee.values());
    }
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        for (PossibleEmployee possibleEmployee : possibleEmployee) {
            employees.add(new Employee(
                    possibleEmployee.getId(),
                    possibleEmployee.getName(),
                    DateConverter.getDateInLocalDateFormat(possibleEmployee.getDateOfBirth())));
        }
        return employees;
    }
}
