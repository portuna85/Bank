package ch11.sec14.Date;

import java.util.Calendar;

public class CalenderEx {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int yer = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(yer + "년 " + month + "월 " + day + "일 입니다.");

    }
}
