package ch07.sec07_2;

public class CarEx {

    public static void main(String[] args) {

        Car car = new Car();

        for (int i = 0; i < 8; i++) {

            int problemLocation = car.run();

            // 빵꾸가 나면 이쪽으로 들어온다.
            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 한국타이어로 교체");
                    car.frontLeftTire = new Hankook(25, "앞 왼쪽");
                    break;
                case 2:
                    System.out.println("앞 오른쪽 한국타이어로 교체");
                    car.frontRightTire = new Hankook(30, "앞 오른쪽");
                    break;
                case 3:
                    System.out.println("앞 오른쪽 금호타이어로 교체");
                    car.backLeftTire = new Kumho(10, "뒤 왼쪽");
                case 4:
                    System.out.println("앞 오른쪽 한국타이어로 교체");
                    car.backRightTire = new Kumho(50, "뒤 오른쪽");
            }

            System.out.println("------------------------------------------");

        }
    }
}
