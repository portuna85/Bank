package Cal.sec14;

public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-70);
        System.out.println("현재 속도 : "+myCar.getSpeed());

        myCar.setSpeed(73);
        System.out.println("현재 속도 : "+myCar.getSpeed());

        if(!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도 : "+myCar.getSpeed());
    }
}