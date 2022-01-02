package ch07.sec04;

public class SupersonicAirplaneEx {
    public static void main(String[] args) {
        SupersonicAirplane fly = new SupersonicAirplane();
        fly.takeOff();
        fly.fly();
        fly.flyMode = 2;
        fly.fly();
        fly.flyMode = 1;
        fly.fly();
        fly.land();

    }
}
