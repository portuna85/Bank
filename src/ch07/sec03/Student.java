package ch07.sec03;

import java.util.Scanner;

public class Student extends People{
    public int studentNo;

    public Student(String name, String phoneNo, int studentNo) {
        super(name, phoneNo);
        this.studentNo = studentNo;
    }

    Scanner sc = new Scanner(System.in);

    public void inputJob() {
        String job;
        System.out.print("직업 입력 : ");
        job =sc.next();
        setJob(job);
    }

    public void inputSsn() {
        String ssn;
        System.out.print("직업 입력 : ");
        ssn = sc.next();
        setJob(ssn);
    }
}