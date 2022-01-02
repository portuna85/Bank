package ch13.sec04.exam03_generic_param;

public class BoundedTypeParameterExam {
    public static void main(String[] args) {
        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result2 = Util.compare(41.5, 21);
        System.out.println(result2);
    }
}