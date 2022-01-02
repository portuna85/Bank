package ch07.sec07_3;

public class CarEx {

    public static void main(String[] args) {

        Car car = new Car();

        for (int i = 0; i < 8; i++) {
            int problemLocation = car.run();
            if(problemLocation != 0) {
                System.out.println(car.tire[problemLocation-1].location + " 한국타이어로 교체");
                car.tire[problemLocation-1] =
                        new Hankook(15,car.tire[problemLocation-1].location);
            }

            System.out.println("------------------------------------------");

        }
    }
}
