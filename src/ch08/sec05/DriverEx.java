package ch08.sec05;

public class DriverEx {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;


        bus.run();
        bus.checkFare();
    }
}
