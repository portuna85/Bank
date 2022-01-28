package ch13.sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExam {
        public static void registerCourse(Course<?> course) {
            System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
        }

        public static void registerStudent(Course<? extends Student> course) {
            System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
        }

        public static void registerWorker(Course<? super Worker> course) {
            System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
        }

        public static void main(String[] args) {
            Course<Person> personCourse = new Course<>("일반인 과정", 5);
            personCourse.add(new Person("일반인"));
            personCourse.add(new Person("직장인"));
            personCourse.add(new Person("학생"));
            personCourse.add(new Person("고등학생"));

            Course<Worker> workderCourse = new Course<>("직장인 과정", 5);
            workderCourse.add(new Worker("직장인"));

            Course<Student> studentCourse = new Course<>("학생 과정", 5);
            studentCourse.add(new Student("학생"));
            studentCourse.add(new HighStudent("고등학생"));

            Course<HighStudent> highstudentCourse = new Course<>("고등학생 과정", 5);
            highstudentCourse.add(new HighStudent("고등학생"));

            registerCourse(personCourse);
            registerCourse(workderCourse);
            registerCourse(studentCourse);
            registerCourse(highstudentCourse);
            System.out.println();

            registerStudent(studentCourse);
            registerStudent(highstudentCourse);
            System.out.println();

            registerWorker(personCourse);
            registerWorker(workderCourse);
            System.out.println();
        }

}
