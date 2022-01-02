package ch08.sec02;

public interface RemoteControl {
    public static final int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;


    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute==true) {
            System.out.println("음소거 모드 실행");
        } else {
            System.out.println("음소거 모드 해제");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}