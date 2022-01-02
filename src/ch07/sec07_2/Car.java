package ch07.sec07_2;

public class Car {

    Tire frontLeftTire = new Tire(10, "앞 왼쪽");
    Tire frontRightTire = new Tire(5, "앞 오른쪽");
    Tire backLeftTire = new Tire(8, "뒤 왼쪽");
    Tire backRightTire = new Tire(9, "뒤 오른쪽");

    int run() {

        if (frontLeftTire.roll() == false) {
            stop();
            return 1;
        }
        if (frontRightTire.roll() == false) {
            stop();
            return 2;
        }
        if (backLeftTire.roll() == false) {
            stop();
            return 3;
        }
        if (backRightTire.roll() == false) {
            stop();
            return 4;
        }

        return 0;
    }

    void stop() {
        System.out.println("자동차 정지");
    }
}
