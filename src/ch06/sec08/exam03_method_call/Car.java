package ch06.sec08.exam03_method_call;

public class Car {
    public int speed;

    public int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("시동을 켭니다.");
    }

    void run() {
        for (int i = 10; i <= 50; i++) {
            this.speed = i;
            System.out.println("시속 : " + speed + "km/h");
        }
    }

}
