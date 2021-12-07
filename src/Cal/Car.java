package Cal;

public class Car {
    String model;
    int speed;

    Car(String model){
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void turnOn() {
        System.out.println(this.model+"시동을 켭니다.");
    }

    void run() {
        for(int i=10;i<=50;i+=10){
            this.speed = i;
            System.out.println(this.model+" 속도가 증가합니다" + this.speed);
        }
    }
}
