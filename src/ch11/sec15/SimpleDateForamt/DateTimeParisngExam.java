package ch11.sec15.SimpleDateForamt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParisngExam {
    public static void main(String[] args) {
        DateTimeFormatter formatter;
        LocalDate localDate;

        localDate = LocalDate.parse("2023-03-24");
        System.out.println(localDate);

        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        localDate = LocalDate.parse("2023-03-24",formatter);
        System.out.println(localDate);

    }
}
