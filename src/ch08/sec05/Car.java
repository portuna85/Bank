package ch08.sec05;

public class Car {
    Tire[] tires = {
            new Hankook(),
            new Hankook(),
            new Hankook(),
            new Hankook()
    };


    void run() {
        for(Tire tire : tires) {
            tire.roll();
            }
    }
}
