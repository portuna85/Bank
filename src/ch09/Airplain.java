package ch09;

public class Airplain {

    static class staticClass extends Airplain{

    }

    class nonStaticClass extends staticClass{

    }

    class inner3 extends nonStaticClass {
    }

}
