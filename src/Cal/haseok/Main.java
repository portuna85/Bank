package Cal.haseok;

public class Main {

    public static void main(String[] args) {

        MyCar myCar = new MyCar();
        myCar.setSpeed(120);
        System.out.println("myCar = " + myCar);

        int speed = myCar.getSpeed();

        if (speed > 100) {
            System.out.println("졸라 빠릅니다. 감속하겠습니다.");
            myCar.decreaseSpeed(10);
            System.out.println("speed = " + myCar.getSpeed());
        } else {
            System.out.println("졸라 느립니다.");
        }
    }
}