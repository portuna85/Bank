package ch11.sec14.Date;

import java.util.TimeZone;

public class PrintTimeZone {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();

        for (String id:availableIDs) {
            System.out.println(id);
        }
    }

}
