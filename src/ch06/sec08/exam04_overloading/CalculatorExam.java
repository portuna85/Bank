package ch06.sec08.exam04_overloading;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("정사각형 넓이 : " + cal.areaRectangle(5.5));
        System.out.println("직사각형 넓이 : " + cal.areaRectangle(5.5, 7.3));
    }
}
