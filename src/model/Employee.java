package model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private final int id;
    private final String name;

    private final LocalDate dateOfBirth;
    private final String email;

    public Employee(int id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = generateEmail();
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private String generateEmail() {
        StringBuilder emailBuilder = new StringBuilder();
        int year = this.dateOfBirth.getYear();
        String lastTwoDigitsOfTheYear = String.format("%02d", year % 100);
        emailBuilder.append(this.name).append('_')
                .append(lastTwoDigitsOfTheYear)
                .append("@mail.ru");
        return emailBuilder.toString();
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "id = " + id +
                ", Имя = " + name +
                ", Дата рождения = " +
                String.format("%02d", dateOfBirth.getDayOfMonth()) + "." +
                String.format("%02d", dateOfBirth.getMonthValue()) + "." +
                dateOfBirth.getYear() + ", " +
                "email = " + email + "\n";
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.id, otherEmployee.id);
    }
}

