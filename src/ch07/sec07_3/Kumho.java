package ch07.sec07_3;

public class Kumho extends Tire {

    public Kumho(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulateRotation;                   // 누적 회전수 1씩 증가
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "금호 타이어 수명 " + (maxRotation - accumulateRotation) + "회 입니다.");
            return true;
        } else {
            System.out.println(location + "의 금호타이어가 펑크 정지합니다.");
            return false;
        }
    }
}
