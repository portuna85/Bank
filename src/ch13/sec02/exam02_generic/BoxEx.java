package ch13.sec02.exam02_generic;

public class BoxEx {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.setT("Hello");
        String str = box1.getT();

        Box<Integer> box2 = new Box<Integer>();
        box2.setT(45);
        int value = box2.getT();
    }
}