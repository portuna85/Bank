package ch15.sec05.exam02_treemap;

import java.util.*;

public class TreeMapExam3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMep = new TreeMap<>();
        treeMep.put("apple", 10);
        treeMep.put("forever",60);
        treeMep.put("description",40);
        treeMep.put("ever",50);
        treeMep.put("zoo", 10);
        treeMep.put("base", 20);
        treeMep.put("guess", 70);
        treeMep.put("cherry", 30);

        System.out.println("[c~f 사이의 단어 검색]");
        NavigableMap<String, Integer> rangMap = treeMep.subMap("c", true, "f", true);
        for (Map.Entry<String, Integer> entry : rangMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}