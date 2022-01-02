package ch11.sec07.method;

public class StringLengtheExam {
    public static void main(String[] args) {
        String ssn = "6497494631579";
        int right = ssn.length();

        System.out.println(right);

        if(right == 13) {
            System.out.println("주민번호가 옳바름");
        } else {
            System.out.println("주민번호 잘못 입력");
        }

    }
}
