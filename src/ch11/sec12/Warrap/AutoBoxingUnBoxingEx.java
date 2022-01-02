package ch11.sec12.Warrap;

public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("obj = " + obj.intValue());
        
        int val = obj;
        System.out.println("val = " + val);

        int result = obj + 200;
        System.out.println("result = " + result);
    }
}
