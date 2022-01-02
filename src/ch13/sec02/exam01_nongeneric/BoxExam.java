package ch13.sec02.exam01_nongeneric;

public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();

        box.setObj("Hong");
        String name = (String) box.getObj();

        box.setObj(new Apple());
        Apple apple = (Apple) box.getObj();
    }
}