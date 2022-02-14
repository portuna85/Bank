package ch06.sec08.exam04_overloading;

public class Calculator {
    public double areaRectangle(double width) {
        return width * width;
    }

    public double areaRectangle(double width, double height) {
        return width * height;
    }
}
