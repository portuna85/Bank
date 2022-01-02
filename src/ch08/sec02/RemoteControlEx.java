package ch08.sec02;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
        
        rc.turnOn();
        rc.turnOff();
    }
}
