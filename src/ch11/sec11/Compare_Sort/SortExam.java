package ch11.sec11.Compare_Sort;
import java.util.Arrays;

public class SortExam {
    public static void main(String[] args) {
        int[] scores = {95, 99, 80};

        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
        System.out.println();

        String[] names = {"홍길동", "김가영", "박문수"};
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
        }
        System.out.println();

        Member m1 = new Member("홍길동");
        Member m2 = new Member("김가영");
        Member m3 = new Member("Park moon su");

        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        for (int i = 0; i < members.length; i++) {
            System.out.println("members[" + i + "] = " + members[i].name);
        }
    }
}