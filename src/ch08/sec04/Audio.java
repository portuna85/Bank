package ch08.sec04;

public class Audio implements RemoteControl {
    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute==true) {
            System.out.println("오디오음소거 모드 실행");
        } else {
            System.out.println("오디오음소거 모드 해제");
        }
    }

}
