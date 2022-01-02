package ch07.sec07;

public class KumhoTire extends Tire {

    public KumhoTire() {
        super();
        System.out.println("KumhoTire.KumhoTire");
    }

    @Override
    public void roll() {
        System.out.println("금호타이어가 굴러갑니다.");
    }
}
