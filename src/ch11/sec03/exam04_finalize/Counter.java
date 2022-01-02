package ch11.sec03.exam04_finalize;

public class Counter {
    private int num;

    public Counter(int num) {
        this.num = num;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(num + "번째 객체가 finalize() 실행됨");
    }
}