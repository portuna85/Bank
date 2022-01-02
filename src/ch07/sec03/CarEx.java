package ch07.sec03;

public class CarEx {
    public static void main(String[] args) {
        /*
        기본생성자로 객체 생성.
        setter로 speed입력하도록 구현
            - setter 안에서: 조건 음수로 들어올경우 0으로 초기화
         */


        Car car1 = new Car();




        Car car = new Car();
        car.setSpeed(10);
        System.out.println(car.getSpeed());
        car.setSpeed(20);
        System.out.println(car.getSpeed());
        car.setSpeed(-10);
        System.out.println(car.getSpeed());

//        Car car = new Car(10);
//        System.out.println(car.getSpeed());
//        car.speedUp();
//        System.out.println(car.getSpeed());

    }
}
