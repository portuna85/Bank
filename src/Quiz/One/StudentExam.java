package Quiz.One;

import java.util.HashMap;

public class StudentExam {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<Student, String>();

        hashMap.put(new Student("1"), "95");

        String score = hashMap.get(new Student("1"));
        System.out.println(score);

    }
}
