package Example;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;

        while (run) {

            System.out.println("-------------------------------------------------");
            System.out.println("1.계좌생성 : 2.계좌목록 : 3.예금 : 4.출금 : 5. 종료");
            System.out.println("-------------------------------------------------");
            System.out.println("선택 > ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                creatAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료!");
    }


    // 계좌 생성
    private static void creatAccount() {

        System.out.println("-----------");
        System.out.println("계좌 생성2");
        System.out.println("-----------");

        Account account = new Account();

        System.out.println("계좌 번호: ");
        account.setAno(scanner.next());

        System.out.println("계좌 주: ");
        account.setOwner(scanner.next());

        System.out.println("초기금액 : ");
        account.setBalance(scanner.nextInt());

        for (int i = 0; i < accountArray.length; i++) {

            if (accountArray[i] == null) {
                accountArray[i] = account;
                System.out.println("계좌 생성!!");
                break;
            }
        }

    }

    // 계좌 목록
    private static void accountList() {

        System.out.println("-----------");
        System.out.println("계좌 목록");
        System.out.println("-----------");

        for (int i = 0; i < accountArray.length; i++) {

            Account account = accountArray[i];

            if (account != null) {
                System.out.println(account.getAno() + "  " + account.getOwner() + "  " + account.getBalance());
            }
        }
    }

    // 예금
    private static void deposit() {

    }

    // 출금
    private static void withdraw() {

    }

    // Account 배열에서 ano와 동일한 Account 찾기
    private static Account findAccount(String ano) {

        return null;
    }
}
