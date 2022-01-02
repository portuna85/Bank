package ch09.sec04;

public class CallListener implements Button.OnClickListener {
    @Override
    public void onCLick() {
        System.out.println("전화를 겁니다.");
    }
}