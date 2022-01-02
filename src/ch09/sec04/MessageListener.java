package ch09.sec04;

public class MessageListener implements Button.OnClickListener {
    @Override
    public void onCLick() {
        System.out.println("메시지를 보냅니다.");
    }
}
