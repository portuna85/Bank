package ch13.sec02.exam01_none_generic_type.exam01_class_interface;

public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("홍길동");
        String name = (String) box.getObject();

        System.out.println(name);

        box.setObject(new Apple());
        Apple apple = new Apple();
        System.out.println(apple.toString());
    }
}
