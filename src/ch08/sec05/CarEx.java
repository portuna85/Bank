package ch08.sec05;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tires[0] = new Kumho();
        myCar.tires[1] = new Kumho();
        myCar.run();
    }
}