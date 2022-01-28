package ch13.sec04.exam02_generic_method;

public class CompareMethodEx {
    public static void main(String[] args) {
        Pare<Integer, String> p1 = new Pare<>(1, "사과");
        Pare<Integer, String> p2 = new Pare<>(1, "사과");

        boolean result = Util.compare(p1, p2);
        if (result) {
            System.out.println("논리적으로 동등한 객체!");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체!!");
        }

        Pare<Integer, String> p3 = new Pare<>(3, "홍길동");
        Pare<Integer, String> p4 = new Pare<>(3, "김길동");
        boolean result1 = Util.compare(p3, p4);
        if (result1) {
            System.out.println("논리적으로 동등한 겍체!");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체!!");
        }
    }
}
