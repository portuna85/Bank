package ch15.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(95);
        scores.add(48);
        scores.add(70);
        scores.add(89);
        scores.add(96);
        scores.add(88);
        scores.add(93);
        scores.add(32);
        scores.add(78);
        scores.add(80);

        NavigableSet<Integer> descendingSet = scores.descendingSet();

        for (Integer score : descendingSet) {
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();

        for (Integer score : ascendingSet) {
            System.out.print(score + " ");
        }

    }
}
