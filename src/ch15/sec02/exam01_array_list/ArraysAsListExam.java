package ch15.sec02.exam01_array_list;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExam {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("홍길동", "고길동", "마이콜");
        for (String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        for (int value : list2) {
            System.out.println(value);
        }
    }
}