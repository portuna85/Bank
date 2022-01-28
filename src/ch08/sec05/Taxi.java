package ch08.sec05;

public class Taxi extends Car implements Vehicle, Runnable {


    public void move() {
        System.out.println("택시가 달립니다.");
    }

    @Override
    public void run() {
        System.out.println("Taxi.run");
    }
}