package ch06.sec08.exam03_method_call;

public class CalulatorExam {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.execute();

        int sum = cal1.plus(214, 512);
        System.out.println(sum);

        System.out.println(cal1.plus(4, 6));

    }
}
