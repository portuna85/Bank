package ch09;

public class A {
    A(){
        System.out.println("A 객체 생성됨");
    }

    class B {
        B() {
            System.out.println("B 객체 생성됨");
        }

        int field1;

        void method1() {
        }
    }
    static class C {
        C() {
            System.out.println("C 객체 생성됨");
        }
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
   }


}
