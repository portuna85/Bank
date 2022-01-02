package ch11.sec07.method;

public class StringSubstringExam {
    public static void main(String[] args) {
        String ssn = "768431-1687613";

        String firstNum = ssn.substring(0,6);
        String secondNum = ssn.substring(7);
        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
