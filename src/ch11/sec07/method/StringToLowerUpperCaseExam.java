package ch11.sec07.method;

import java.util.Locale;

public class StringToLowerUpperCaseExam {
    public static void main(String[] args) {
        String str1 ="JAVA";
        String str2 = "java";
        System.out.println(str1.equals(str2));

        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        System.out.println(lowerStr2.equals(lowerStr1));
    }
}
