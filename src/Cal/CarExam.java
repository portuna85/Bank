package Cal;

public class CarExam {
    public static void main(String[] args) {
        Car myCar1 = new Car("소나타");
        Car myCar2 = new Car("마티즈");

        myCar1.turnOn();
        myCar1.run();

        myCar2.turnOn();
        myCar2.run();
    }
}