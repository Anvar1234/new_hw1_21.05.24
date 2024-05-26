package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {
    public static LocalDate getDateInLocalDateFormat(String date){
        DateTimeFormatter formatterForDateParsing = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(date, formatterForDateParsing);
    }
}
