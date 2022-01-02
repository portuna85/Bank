package ch11.sec04.exam01_compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    /*@Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.sno,s2.sno);
    }*/

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.sno < s2.sno) {
            return -1;
        } else if (s1.sno == s2.sno) {
            return 0;
        } else {
            return 1;
        }
    }
}