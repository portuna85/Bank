package Cal.sec14;

public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-60);

        System.out.println(myCar.isSpeed());

        myCar.setSpeed(60);

        if(!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("지금 속도 : "+myCar.isSpeed());
    }
}
