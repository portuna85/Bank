package ch11.sec03.exam04_objects;

import java.util.Objects;
import java.util.Comparator;

public class CompareExam {
    public static void main(String[] args) {

        Student st1 = new Student(100, "a", 10);
        Student st2 = new Student(200, "b", 5);

        int result2 = Objects.compare(st1, st2, new StudentComparator());
        System.out.println(result2);

    }

    static class Student {
        public int sno;
        public int age;
        public String name;

        public Student(int sno, String name, int age) {
            this.sno = sno;
            this.name = name;
            this.age = age;
        }
    }

    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {

            int snoCompare = Integer.compare(o1.sno, o2.sno);
            int ageCompare = Integer.compare(o1.age, o2.age);

            return (snoCompare + ageCompare) >= 2 ? 1 : 0;
        }
    }
}
