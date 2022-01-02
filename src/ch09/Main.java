package ch09;

public class Main {

    public static void main(String[] args) {

        CarFactory.Car car = new CarFactory.Car();

        CarFactory.User user = new CarFactory().new User();
        user.setAge(35);
        user.setName("haseok");
        System.out.println("user = " + user.toString());

    }
}
