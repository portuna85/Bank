package ch10.sec02;

public class ArrayIndexOutOfBoundsExceptionExam {
    public static void main(String[] args) {
        if(args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println("args[0]" + data1);
            System.out.println("args[1]" + data2);
        } else {
            System.out.println("[실행방법]");
            System.out.println("java ArrayIndexOutOfBoundsExceptionExample ");
            System.out.println("값1 값2");
        }
    }
}