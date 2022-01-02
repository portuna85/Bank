package ch13.sec04.exam01_generic_method;

public class BoxingMethodExam {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        Box<String> box2 = Util.boxing("홍길동");
        String strValue = box2.getT();
        System.out.println(strValue);
    }
}
