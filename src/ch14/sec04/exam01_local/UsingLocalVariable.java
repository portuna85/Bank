package ch14.sec04.exam01_local;

public class UsingLocalVariable {
    void method(int args) {
        int localVar = 40;

        /*
        args = 31;
        localVar = 55;
        */

        MyFunctionInterface fi = () -> {
            System.out.println("args : " + args);
            System.out.println("localVar : " + localVar);
        };
        fi.method();
    }
}
