package util;

import java.time.LocalDate;
import java.util.Arrays;

public class DateConverter {

    public static LocalDate getLocalDateFromStringDate(String date){
        String[] dateArray = date.split("-");

        int day = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[2]);

        return LocalDate.of(year, month, day);
    }
}
