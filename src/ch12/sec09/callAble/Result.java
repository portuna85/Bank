package ch12.sec09.callAble;

public class Result {
    public int accumValue;

    synchronized void addValue(int value) {
        accumValue += value;
    }
}