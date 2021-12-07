public class AccountExam {
    public static void main(String[] args) {

        Account account = new Account("haseok", "12345", "99999", "01012345678",
                10, new Address(3123, "suwon", "seoul"));
        System.out.println("account = " + account);
    }
}
