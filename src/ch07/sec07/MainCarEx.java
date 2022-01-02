package ch07.sec07;

public class MainCarEx {

    public static void main(String[] args) {
        Car car = new Car();

        car.frontTire = new HankookTire();
        car.run();
    }
}
