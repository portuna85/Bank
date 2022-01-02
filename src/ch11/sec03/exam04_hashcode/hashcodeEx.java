package ch11.sec03.exam04_hashcode;

import java.util.Objects;

public class hashcodeEx {
    public static void main(String[] args) {
        Student st1 = new Student(1,"jsbae");
        Student st2 = new Student(1,"hsbae");
        Student st3 = new Student(1,"jsbae");

        System.out.println(st1.hashCode());
        System.out.println(Objects.hash(st2));

    }

    static class Student {
        public int sno;
        public String name;

        public Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sno, name);
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Student) {
                Student s = (Student) obj;
                if(s.sno == this.sno) {
                    if(s.name.equals(this.name)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}