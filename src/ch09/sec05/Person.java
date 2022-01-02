package ch09.sec05;

public class Person {

    void wakeWithParams(int flag) {

        switch (flag) {
            case 1:
                System.out.println("7시에 일어납니다");
                break;
            case 2:
                System.out.println("6시에 일어납니다");
                break;
            case 3:
                System.out.println("9시에 일어납니다");
                break;
            default:
                System.out.println("10시에 일어납니다");
                break;
        }

    }

    void wake() {
        System.out.println("7시에 일어납니다.");
    }
}