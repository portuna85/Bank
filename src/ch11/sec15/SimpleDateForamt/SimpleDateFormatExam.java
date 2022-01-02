package ch11.sec15.SimpleDateForamt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {
    public static void main(String[] args) {
            Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf= new SimpleDateFormat("D");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("E");
        System.out.println(sdf.format(now));
    }
}