package ch11.sec05.exam02gc;

public class Employee {
    public int eno;

    public Employee(int eno) {
        this.eno = eno;
        System.out.println("Employee(" + eno + ")이 메모리에서 생성됨");
    }
}