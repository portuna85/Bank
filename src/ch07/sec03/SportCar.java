package ch07.sec03;

public class SportCar extends Car{

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 10);
    }

}
