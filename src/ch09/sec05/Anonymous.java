package ch09.sec05;

public class Anonymous {

    Person person = new Person();

    void wake(int flag) {
        person.wakeWithParams(flag);
    }

    Person field = new Person() {

        @Override
        void wake() {

        }
    };

    Person wakeup9 = new Person() {
        @Override
        void wake() {
            System.out.println("9시에 일어납니다");
        }
    };

    void method1() {

        Person localVar = new Person() {
            void walk() {
                System.out.println("산책 시작");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };

        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}