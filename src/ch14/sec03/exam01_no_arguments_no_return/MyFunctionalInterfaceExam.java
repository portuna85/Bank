package ch14.sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExam {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("mothod call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();
    }
}
