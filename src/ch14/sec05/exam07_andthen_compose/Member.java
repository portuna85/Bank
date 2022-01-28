package ch14.sec05.exam07_andthen_compose;

public class Member {
    private String name;
    private String id;
    private Address addrss;

    public Member(String name, String id, Address addrss) {
        this.name = name;
        this.id = id;
        this.addrss = addrss;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAddrss() {
        return addrss;
    }
}
