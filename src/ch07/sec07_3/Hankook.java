package ch07.sec07_3;

public class Hankook extends Tire {

    public Hankook(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulateRotation;                   // 누적 회전수 1씩 증가
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "한국 타이어 수명 " + (maxRotation - accumulateRotation) + "회 입니다.");
            return true;
        } else {
            System.out.println(location + "의 한국타이어가 펑크 정지합니다.");
            return false;
        }
    }
}
