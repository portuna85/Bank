package ch08.sec04;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc = null;
        rc = new Television();

        rc.turnOn();
        rc.turnOff();

        rc.setMute(false);

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();

        rc.setMute(true);

        RemoteControl.changeBattery();
    }
}
