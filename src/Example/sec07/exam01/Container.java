package Example.sec07.exam01;

public class Container<T> {
    private T t;

    public Container() {
    }

    public Container(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
