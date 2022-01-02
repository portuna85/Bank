package ch11.sec12.Warrap;

public class BoxingUnBoxing {
    public static void main(String[] args) {
        Integer obj1 = new Integer(100);
        Integer obj2 = Integer.valueOf("200");
        Integer obj3 = Integer.valueOf(199);

        System.out.println(obj1.intValue());
        System.out.println(obj2.intValue());
        System.out.println(obj3.intValue());
    }
}
