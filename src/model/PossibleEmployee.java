package model;

public enum PossibleEmployee {

    EMPLOYEE_1("Анатолий", "12-12-1990"),
    EMPLOYEE_2("Чубайс", "11-11-1991"),
    EMPLOYEE_3("Валерий", "16-02-1990"),
    EMPLOYEE_4("Роберт", "01-03-1987"),
    EMPLOYEE_5("Дед", "11-11-1951"),
    EMPLOYEE_6("Бабка", "25-07-1955"),
    EMPLOYEE_7("Внучка", "29-02-2000"),
    EMPLOYEE_8("Тимур", "15-09-2001"),
    EMPLOYEE_9("Алена", "01-01-1996"),
    EMPLOYEE_10("Гульназ", "15-08-1998");


    private int id;
    private final String name;
    private final String dateOfBirth;

    PossibleEmployee(String inputName, String inputDateOfBirth) {
        this.id = this.ordinal() + 1;
        this.name = inputName;
        this.dateOfBirth = inputDateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
