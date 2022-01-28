package ch14.sec03.exam03_arguments_return;

public class MyFunctionalInterfaceExam {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x, y) -> {
            int result = x * y;
            return result;
        };
        System.out.println(fi.method(2, 7));

        fi = (x, y) -> {
            return x + y;
        };
        System.out.println(fi.method(8,3));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(8,4));
    }

    public static int sum(int x, int y) {
        return (x / y);
    }
}