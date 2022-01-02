package Quiz;

public class NestedClassExam {
    public static void main(String[] args) {
        Car myCar = new Car();



        Car.Tire tire = myCar.new Tire();
        Car.engine engine = new Car.engine();
    }
}
