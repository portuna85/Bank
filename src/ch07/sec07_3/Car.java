package ch07.sec07_3;

public class Car {

    Tire[] tire = {
            new Tire(6, "앞 왼쪽"),
            new Tire(2, "앞 오른쪽"),
            new Tire(3, "뒤 왼쪽"),
            new Tire(5, "뒤 오른쪽")
    };

    int run() {
        System.out.println("[자동차가 달립니다.]");
        for (int i = 0; i < tire.length; i++) {
            if (tire[i].roll() == false) {
                stop();
                return (i + 1);
            }

        }

        return 0;
    }

    void stop() {
        System.out.println("[자동차 정지]");
    }
}