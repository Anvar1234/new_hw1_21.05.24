package preparer.impl;

import model.Employee;
import model.PossibleEmployee;
import preparer.EmployeePreparable;
import util.DateConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeePreparer implements EmployeePreparable {
    private static final List<PossibleEmployee> possibleEmployee = getPossibleEmployee();
    private static List<PossibleEmployee> getPossibleEmployee() {
        return Arrays.asList(PossibleEmployee.values());
    }
    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        for (PossibleEmployee p : possibleEmployee) {
            employees.add(new Employee(
                    p.getId(),
                    p.getName(),
                    DateConverter.getLocalDateFromStringDate(p.getDateOfBirth())));
        }
        return employees;
    }


}
