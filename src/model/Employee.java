package model;

import java.time.LocalDate;

public class Employee {
    private int id;
    private final String name;

    private final LocalDate dateOfBirth;
    private String email;

    public Employee(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = generateEmail();
    }
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

    private String generateEmail(){
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
        return "Employee:" +
                "id = " + id +
                ", name= " + name +
                ", dateOfBirth = " +
                String.format("%02d", dateOfBirth.getDayOfMonth()) + "." +
                String.format("%02d", dateOfBirth.getMonthValue()) + "." +
                dateOfBirth.getYear() + " " +
                "email= " + email +
                '}' + "\n";
    }

//    @Override
//    public int compareTo(Employee otherEmployee) {
//        if(this.dateOfBirth.isBefore(otherEmployee.dateOfBirth)){
//            return 1;
//        } else if(this.dateOfBirth.isEqual(otherEmployee.dateOfBirth)){
//            return 0;
//        } else {
//            return -1;
//        }
//}
}

