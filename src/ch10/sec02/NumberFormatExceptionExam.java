package ch10.sec02;

public class NumberFormatExceptionExam {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "1100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);




        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }
}
