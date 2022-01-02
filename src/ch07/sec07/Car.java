package ch07.sec07;

public class Car {

    public String marketName;
    public String name;
    public Tire frontTire = new Tire();
    public Tire backTire = new Tire();

    public Car() {
        System.out.println("Car.Car");
    }

    public Car(String name) {}
    public Car(String name, String marketName) {}
    public Car(Tire frontTire) {}
    public Car(String marketName, String name, Tire frontTire, Tire backTire) {}

    public void run() {
        frontTire.roll();
        backTire.roll();
    }
}
