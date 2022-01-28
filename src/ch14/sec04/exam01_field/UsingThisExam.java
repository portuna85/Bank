package ch14.sec04.exam01_field;

public class UsingThisExam {
    public static void main(String[] args) {
        UsingThis ut = new UsingThis();
        UsingThis.Inner inner = ut.new Inner();

        inner.method();
    }
}
