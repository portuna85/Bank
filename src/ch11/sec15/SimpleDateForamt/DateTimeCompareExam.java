package ch11.sec15.SimpleDateForamt;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeCompareExam {
    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
        System.out.println("시작일 : " + startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
        System.out.println("종료일 : " + endDateTime);
        if (startDateTime.isBefore(endDateTime)) {
            System.out.println("진행중 입니다." + "\n");

        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다." + "\n");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("종료 했습니다." + "\n");
        }
    }
}
