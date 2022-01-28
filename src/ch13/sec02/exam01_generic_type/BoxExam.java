package ch13.sec02.exam01_generic_type;

public class BoxExam {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setT("hello");

        String str = box.getT();

        Box<Integer> box1 = new Box<>();
        box1.setT(7);
        int value = box1.getT();
    }
}
