package ch11.sec15.SimpleDateForamt;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExam {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime targetTime = null;

        targetTime = now
                .withYear(2026)
                .withMonth(10)
                .withDayOfMonth(21)
                .withHour(19)
                .withMinute(59);
        System.out.println(targetTime);

        targetTime = now.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(targetTime);
    }
}