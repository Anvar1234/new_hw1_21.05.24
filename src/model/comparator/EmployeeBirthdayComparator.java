package model.comparator;
import model.Employee;
import java.util.Comparator;

public class EmployeeBirthdayComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getDateOfBirth().isBefore(o2.getDateOfBirth())) {
            return -1;
        } else if (o1.getDateOfBirth().isEqual(o2.getDateOfBirth())) {
            return 0;
        } else {
            return 1;
        }
    }
}
