package ch11.sec06.newinstance;

public class SendAction implements Action{
    @Override
    public void execute() {
        System.out.println("데이터를 보냅니다.");
    }
}
