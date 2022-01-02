package ch11.sec03.exam04_null;

import java.util.Objects;

public class NullExam {
    public static void main(String[] args) {
        String st1 = "jsbae";
        String st2 = null;

        System.out.println(Objects.requireNonNull(st1));

        try {
            System.out.println(st2);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }
}
