package ch14.sec06.exam03_consturctor_referenc;

public class Member {
    private String name;
    private String id;

    public Member() {
        System.out.println("Member() 실행");
    }

    public Member(String id) {
        System.out.println("Member(Strind id) 실행");
        this.id = id;
    }

    public Member(String name, String id) {
        System.out.println("Member(String name, String id)");
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
