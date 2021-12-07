package Cal.sec10;

public class PersonExam {
    public static void main(String[] args) {
        Person p1 = new Person("646791-4649763","Hddsf");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);
        System.out.println("");
        p1.name = "홍길동";
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);
    }
}
