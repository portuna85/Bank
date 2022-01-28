package ch14.sec06.exam01_static_instance;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExam {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println(operator.applyAsInt(4,2));

        operator = Calculator::staticMethod;
        System.out.println(operator.applyAsInt(3, 7));

        Calculator obj = new Calculator();

        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println(operator.applyAsInt(5, 8));

        operator = obj::instanceMethod;
        System.out.println(operator.applyAsInt(6,9));
    }
}
