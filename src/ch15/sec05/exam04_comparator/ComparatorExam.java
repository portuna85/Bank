package ch15.sec05.exam04_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExam {
    public static void main(String[] args) {
        /*TreeSet<Fruit> treeSet = new TreeSet<>();

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("사과", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + " " + fruit.price);
        }*/

        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("사과", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + " " + fruit.price);
        }
    }
}