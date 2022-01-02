package ch09.sec05;

public class Main {

    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();
        anonymous.wake(1);

        Anonymous anonymous1 = new Anonymous();
        anonymous1.wakeup9.wake();

        Person person = new Person();
        new Person() {

            @Override
            void wakeWithParams(int flag) {
                super.wakeWithParams(flag);
            }

            @Override
            void wake() {
                super.wake();
            }

        };


    }
}
