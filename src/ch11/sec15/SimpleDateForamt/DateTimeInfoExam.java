package ch11.sec15.SimpleDateForamt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeInfoExam {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        String str = now.getYear() + "년 ";
        str += now.getMonthValue() + "월";
        System.out.println(str);

        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        if (nowDate.isLeapYear()) {
            System.out.println("올해 2월 29일있음\n");
        } else {
            System.out.println("올해 2월 28일\n");
        }
    }
}