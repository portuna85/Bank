package ch06.sec04.exam01_field_dev;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델 명 : " + myCar.model);
        System.out.println("색상 : " + myCar.company);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);
        myCar.speed = 60;
        System.out.println("현재속도 : " + myCar.speed);
    }
}