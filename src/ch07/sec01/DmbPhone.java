package ch07.sec01;

public class DmbPhone extends CellPhone {
    private int channel;

    public DmbPhone() {
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    DmbPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("DMB "+channel+"번을 수신시작 합니다.");
    }
    void changeChannelDmb(int i) {
        System.out.println("DMB 채널을 "+channel+"번으로 바꿉니다.");
    }
    void turnOffDmb() {
        System.out.println("DMB 수신을 멈춥니다.");
    }
}