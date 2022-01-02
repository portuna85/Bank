package ch11.sec03.exam04_clone;

public class MemberExam {
    public static void main(String[] args) {
        Member member = new Member("jsbae", "BAE", "aqer", 32, true);

        Member clone = member.getMember();

        clone.id = "hsbae";

        System.out.println("원본 아이디" + member.id);

        System.out.println("복제 아이디" + clone.id);
    }
}