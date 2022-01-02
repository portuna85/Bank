package ch11.sec03.exam04_deapclone;

public class MemberExam {
    public static void main(String[] args) {
        Member member = new Member("usage", 33, new int[]{80, 89, 99}, new Car("SONATA"));

        Member cloned = member.getMember();
        cloned.scores[0] = 67;
        cloned.scores[2] = 79;
        cloned.car.model = "카니발";

        System.out.println("--원본 객체--");
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.car.model);
        for (int i = 0; i < member.scores.length; i++) {
            System.out.print(member.scores[i]);
            System.out.print((i == (member.scores.length - 1)) ? "" : ", ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("--깊은복제 객체--");



        for (int i = 0; i < cloned.scores.length; i++) {
            System.out.print(cloned.scores[i]);
            System.out.print((i == (cloned.scores.length - 1)) ? "" : ", ");
        }
        System.out.println();
        System.out.println(cloned.car.model);

    }
}
