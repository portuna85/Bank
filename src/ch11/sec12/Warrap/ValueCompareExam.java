package ch11.sec12.Warrap;

public class ValueCompareExam {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;

        System.out.println("obj2 == obj1 : " + (obj2 == obj1));
        System.out.println("언박싱후 결과 : " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals 결과 : "+ obj1.equals(obj2));

        System.out.println();
        Integer obj3 = 10;
        Integer obj4 = 10;

        System.out.println("obj3 == obj4 : " + (obj3 == obj4));
        System.out.println("언박싱후 결과 : " + (obj4.intValue() == obj3.intValue()));
        System.out.println("equals 결과 : "+ obj4.equals(obj3));
    }
}
