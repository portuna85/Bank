package ch11.sec03.exam01_equals;

public class Member extends Object {

    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member mem = (Member) obj;
            if (id.equals(mem.id)) {
                return true;
            }
        }
        return false;
    }
}
