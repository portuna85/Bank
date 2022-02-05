package Quiz.sec16;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this.studentNum.equals(o.studentNum)) {
            Student student = (Student) o;
            return student.name.equals(name) && (student.studentNum == studentNum);
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }
}*/
}