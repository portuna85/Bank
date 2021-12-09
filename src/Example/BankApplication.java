package Example;

import java.util.Scanner;

public class BankApplication {

    private static final Account[] accountArray = new Account[100];
    private static final Scanner scanner = new Scanner(System.in);

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


        for (Account account : accountArray) {

            if (account != null) {
                System.out.println(account.getAno() + "  " + account.getOwner() + "  " + account.getBalance());
            }
        }
    }

    // 예금
    private static void deposit() {
        /*
            0. 예금 text 출력
            1. 계좌번호 텍스트 출력
            2. 계좌 번호 입력
            3. 2번에서 입력받은 계좌번호를 이용해서 배열 내 계좌 찾기
                - findAccount 메소드 사용(파라메타 ano, 반환값 Account)
            4. 예금액 텍스트 출력
            5. 예금액 입력
            6. 3번에서 찾은 계좌번호에 5번에서 받은 예금액 입금

            7. 결과성공 택스트 출력
         */
        System.out.println("예금");
        System.out.println("계좌번호 : ");
        String ano = scanner.next();
        Account account = findAccount(ano);

        if (account == null) {
            System.out.println("조회된 계좌가 없없습니다");
        } else {
            System.out.println("예금 액 : ");
            int balance = scanner.nextInt();
            int accountBalance = account.getBalance();

            account.setBalance(balance + accountBalance);
            System.out.println("예금에 성공했습니다.");

        }

    }

    // 출금
    private static void withdraw() {

    }

    // Account 배열에서 ano와 동일한 Account 찾기
    private static Account findAccount(String ano) {

        /*
            1. accountArray for 루프를 이용
            1.1 현재 for 루프에 선택된 account 유효성검사
            2. accountArray     현재 for 루프에 선택된 getAno 와 전달받은 파라메타 ano 와 비교
            3. 같으면            현재 for 루프에 선택된 Account를 리턴
            4. 다르면 accountArray 배열의 길이만큼 반복
            5. 없으면 null 리턴

            향상된 포문 iter
         */

        for (Account account : accountArray) {

            if (account != null) {
                if (account.getAno().equals(ano)) {
                    return account;
                }
            }
        }

        return null;
    }
}
