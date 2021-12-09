package Cal.sec15;

public class Account {
    int balance;
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 100;

    public int getBalance() {
        if(balance<MIN_BALANCE) {
            this.balance = 0;
        } else if(balance>MAX_BALANCE){
            this.balance = 1000000;
        } else {
            this.balance = balance;
        }
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
