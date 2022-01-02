package ch09;

public class CarFactory {

    static class Car {

        public Car() {}

        public void charge() {

        }

        class Wheel {
            public Wheel() {}
        }
    }

    class User {

        private String name;
        private int age;

        public User() {
            // 기본 생성자
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void ride() {
            //User user = CarFactory.this.new User();
            User user = new CarFactory().new User();
        }

        @Override
        public String toString() {
            return "User 출력 합니데이{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class Color {
        public Color() {
        }
    }


    interface Unit {
        public static final int NAME = 0;
    }
}
