package ch11.sec06.newinstance;

public class ReceiveAction implements Action {
    @Override
    public void execute() {
        System.out.println("데이터를 받습니다.");
    }
}