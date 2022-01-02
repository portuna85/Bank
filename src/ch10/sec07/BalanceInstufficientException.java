package ch10.sec07;

public class BalanceInstufficientException extends Exception {
    public BalanceInstufficientException() {}
    public BalanceInstufficientException(String message) {
        super(message);
    }
}