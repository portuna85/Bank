package ch15.sec02.exam01_array_list;

import ch15.sec02.exam03_linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            arrayList.add(num);
        }


        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}

