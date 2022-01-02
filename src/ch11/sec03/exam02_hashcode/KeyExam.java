package ch11.sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExam extends Object {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        hashMap.put(new Key("Hong"), "dragon");

        System.out.println(hashMap.get(new Key("Hong")));
    }
}
