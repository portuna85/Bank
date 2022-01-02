package ch11.sec14.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date date =  new Date();
        String now = date.toString();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String str2 = sdf.format(date);
        System.out.println(str2);
    }
}
