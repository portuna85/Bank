package ch07.sec03;

public class Car {
    private int speed;


    public Car() {
    }

    public void speedUp() {
        speed += 1;
    }
    
    public final void stop() {
        speed = 0;
        System.out.println("정지");
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }
}
