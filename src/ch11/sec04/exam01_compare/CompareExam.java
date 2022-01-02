package ch11.sec04.exam01_compare;

import java.util.Objects;

public class CompareExam {
    public static void main(String[] args) {
        Student st1 = new Student(1);
        Student st2 = new Student(1);
        Student st3 = new Student(3);

        int result = Objects.compare(st1, st2, new StudentComparator());
        System.out.println(result);
        result = Objects.compare(st1,st3,new StudentComparator());
        System.out.println(result);
    }
}
