package ch15.sec05.exam01_treeset;

import ch11.sec07.method.StringToLowerUpperCaseExam;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[c~f 사이의 단어 검색]");
        NavigableSet<String> rangSet = treeSet.subSet("c", true, "f", true);
        for (String word : rangSet) {
            System.out.println(word);
        }
    }
}
