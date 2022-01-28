package ch13.sec02.exam01_generic_type;

public class Box<T> {
    private T t;

    public Box() {
    }

    public Box(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}