package ch06.sec08.exam03_method_call;

public class Calculator {
    public int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        return (double) plus(x, y) / 2;
    }

    void execute() {
        double result = avg(7, 10);
        System.out.println("실행 결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}
