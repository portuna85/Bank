package ch15.sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class CamparableExam {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동", 23));
        treeSet.add(new Person("고길동", 37));
        treeSet.add(new Person("박길동", 53));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + " : " + person.age);
        }
    }
}
