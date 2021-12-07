package Cal.sec10;

public class SingtoneTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        car1.setSpeed(100);

        Singletone st1 = Singletone.getMySingletone();
        Singletone st2 = Singletone.getMySingletone();
        st1.setMaxCount(10);

        System.out.println("car2.getSpeed() = " + car2.getSpeed());
        System.out.println("st2.getMaxCount() = " + st2.getMaxCount());



        // 0
        // 10
        // Spring 에 사용됨
        // 멀티쓰레드 환경 싱글톤 사용시 값이 공유되지 않아서 문제 발생
        // thread 1, thread 2, thread 3
        //

        if(st1.equals(st2)) {
            System.out.println("같은 객체!!");
        } else {
            System.out.println("다르다~~~");
        }

        if(car1.equals(car2)) {
            System.out.println("같은 객체!!");
        } else {
            System.out.println("다르다~~~");
        }
    }
}
