package ch06.sec04.exam01_class_new;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("S1변수가 Student변수를 참조" + s1);

        s1.method();
        s1.speed = 300;
        System.out.println(s1.speed);
        Student s2 = new Student();
        System.out.println("S2변수가 Student변수를 참조" + s2);
    }
}