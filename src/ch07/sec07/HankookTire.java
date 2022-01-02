package ch07.sec07;

public class HankookTire extends Tire {

    public HankookTire() {
        super();
        System.out.println("HankookTire.HankookTire");
    }

    @Override
    public void roll() {
        System.out.println("한국타이어가 굴러갑니다.");
    }
}
