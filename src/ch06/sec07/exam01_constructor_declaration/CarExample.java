package ch06.sec07.exam01_constructor_declaration;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        new Car("RED", 300);
        System.out.println(car.hashCode());
    }
}