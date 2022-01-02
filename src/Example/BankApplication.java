package Example;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;

        while (run) {

            System.out.println("-------------------------------------------------");
            System.out.println("1.계좌생성 : 2.계좌목록 : 3.예금 : 4.출금 : 5. 종료 : 99. 계좌삭제");
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
            } else if (selectNo == 99) {
                removeAccount();
            }
        }
        System.out.println("프로그램 종료!");
    }

    // 계좌 삭제
    public static void removeAccount() {

        /*
            1. 계좌 삭제 텍스트 생성
            2. 사용자로 부터 계좌번호 입력 받기
                - 실패 3. 2번에서 입력받은 계좌번호로 findAccount() 호출해서 계좌 검색
                - 실패 4. 반환받은 계좌를 null 로 초기화
            3. accountArray for loop 실행
            4. 2번에서 입력받은 계좌번호와 일치하는 계좌번호찾기
            5. 있으면 해당 배열값 null 로 초기화
                5.1. 계좌 삭제 텍스트 출력 후 return
            6. 없으면 accountArray 길이 만큼 계속 반복
            7. 반복문이 끝나도록 없으면 계좌 검색 불가 텍스트 출력

            예외처리
                - 계좌 유효성 검사
                - 잔액이 있을경우 계좌 삭제 불가
         */

        System.out.println("계좌 삭제");
        System.out.println("계좌 번호를 입력해주세요.");

        String accountNumber = scanner.next();

        for (int i = 0; i < accountArray.length; i++) {

            if (accountArray[i] != null) {

                if (accountArray[i].getAno().equals(accountNumber)) {

                    if (accountArray[i].getBalance() > 0) {
                        System.out.println("계좌에 잔액이 남아 있어서 삭제 불가 합니다.");
                        System.out.println("잔액: " + accountArray[i].getBalance());
                        return;
                    } else {
                        accountArray[i] = null;
                        System.out.println("계좌가 삭제 되었습니다.");
                        accountList();
                        return;
                    }
                }
            }
        }

        System.out.println("검색된 계좌번호가 없습니다.");
    }


    // 계좌 생성
    private static void creatAccount() {

        /*
            0. 계좌 생성 text 출력
            1. Account 생성자 생성
            2. 계좌번호 text 출력
            3. 계좌번호 입력
            4. 계좌 주 text 출력
            5. 계좌 주 입력
            6. 초기금액 text 출력
            7. 초기금액 입력
            8. for loop문 이용하여 accountArray[]에 setAno, setOwner, setBalance 입력
                - accountArray[]에 null인 곳에 입력.
         */


        System.out.println("-----------");
        System.out.println("계좌 생성");
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

        /*
            0. 계좌 목록 text 출력
            1. Account 생성자 생성
            2. for loop문 사용
               - accountArray의 계좌, 계좌 주, 잔액 출력
               - accountArray 길이 만큼 반복
         */

        System.out.println("-----------");
        System.out.println("계좌 목록");
        System.out.println("-----------");


        Account account = new Account();
        for(int i=0;i < accountArray.length;i++){
            if (account != null) {
                System.out.println(account.getAno() + "  " + account.getOwner() + "  " + account.getBalance());
            }
        }
        /*
        for (Account account : accountArray) {

            if (account != null) {
                System.out.println(account.getAno() + "  " + account.getOwner() + "  " + account.getBalance());
            }
        }*/
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
        /*
         0. 출금 text 출력
         1. 계좌번호 텍스트 출력
         2. 계좌 번호 입력
         3. 2번에서 입력받은 계좌번호를 이용해서 배열 내 계좌 찾기
            - findAccount 메소드 사용(파라메타 ano, 반환값 Account)
         4. 출금액 텍스트 출력
         5. 출금액 입력

         6. 출금액이 잔액보다 클경우 출금 불가능 text 출력

         7. 3번에서 찾은 계좌번호에 5번에서 받은 출금액 차감
         8. 출금액 text 잔액 text 출력

         */

        System.out.println("출금");
        System.out.println("계좌 번호 : ");
        String ano = scanner.next();

        Account account = findAccount(ano);
        System.out.println("출금액");
        int balance = scanner.nextInt();

        if (account != null) {
            int accountBalance = account.getBalance();
            if (accountBalance < balance) {
                System.out.println("잔액부족");
            } else {
                account.setBalance(accountBalance - balance);
                System.out.println("잔액 : " + account.getBalance());
            }
        }
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