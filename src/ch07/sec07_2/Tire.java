package ch07.sec07_2;

public class Tire {

    public int maxRotation;                     //최대 회전수(타이어수명
    public int accumulateRotation;              //누적 회전수
    public String location;                     //타이어 위치

    public Tire() {
    }

    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    public boolean roll() {

        ++accumulateRotation;                   // 누적 회전수 1씩 증가

        if (accumulateRotation < maxRotation) {
            System.out.println(location + "타이어 수명 " + (maxRotation - accumulateRotation) + "회 입니다.");
            return true;
        } else {
            System.out.println(location + "의 타이어가 펑크 정지합니다.");
            return false;
        }
    }
}
