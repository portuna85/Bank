package ch10.sec07;

public class AccountExam {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : "+account.getBalance());

        try {
            account.withdraw(30000);
        } catch (BalanceInstufficientException e) {
            String message = e.getMessage();
            System.out.println();
            e.printStackTrace();
        }
    }
}