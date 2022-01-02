package ch09.sec05_2;

public class AnonymousExam {
    public static void main(String[] args) {
        Annoymous anony = new Annoymous();

        anony.field.turnOn();
        anony.method1();

        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTV를 켭니다.");
            }
            @Override
            public  void turnOff() {
                System.out.println("SmartTV를 끕니다.");
            }
        });
    }
}
