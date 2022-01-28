package ch15.sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        /*scores.add(95);
        scores.add(48);
        scores.add(70);
        scores.add(89);
        scores.add(96);
        scores.add(88);
        scores.add(93);
        scores.add(32);
        scores.add(78);
        scores.add(80);*/

        for (int i = 0; i <= 10; i++) {
            int num = (int) (Math.random() * 100);
            scores.add(num);
            System.out.println(num);
        }

        Integer score = null;
        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = scores.last();
        System.out.println("가장 높은 점수 : " + score + "\n");

        score = scores.lower(88);
        System.out.println("88점 보다 아래 점수 : " + score);

        score = scores.higher(88);
        System.out.println("88점 위의 점수 : " + score + "\n");

        score = scores.floor(80);
        System.out.println("80점 이거나 바로 아래 점수 : " + score);

        score = scores.ceiling(90);
        System.out.println("90점 이거나 바로 위의 점수 : " + score + "\n");

        while (!scores.isEmpty()) {
            score = scores.pollLast();
            System.out.println(score + " (남은 객체 수 : " + scores.size() + ")");
        }
        /*
        Iterator<Integer> iterator = scores.iterator();
        while (iterator.hasNext()) {
            int s = iterator.next();
            iterator.remove();
            System.out.println(s + " (남은 객체 수 : " + scores.size() + ")");
        }
        */
    }
}
