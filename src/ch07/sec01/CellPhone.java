package ch07.sec01;

public class CellPhone {
    final String company = "SAMSUNG";
    private String phoneName;
    String model;
    String color;

    public CellPhone() {
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    void sendCall() {
        System.out.println("전화 발신");
    }

    void receiveCall() {
        System.out.println("전화 수신");
    }

    void endCall() {
        System.out.println("전화 종료");
    }

    void sendMessage(String message) {
        System.out.println("발신메시지 : "+message);
    }

    void receiveMessage(String message) {
        System.out.println("수신메시지 : "+message);
    }
    void hangUp(){
        System.out.println("전화 종료");
    }
}
