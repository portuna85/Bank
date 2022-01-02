package ch10.sec03;

public class TryCatchFinallyExam {
    public static void main(String[] args) {
        try{
            Class Clazz = Class.forName("java.lang.String2");
            System.out.println("클래스 찾음");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } finally {
            System.out.println("---------------------------");
        }
    }
}