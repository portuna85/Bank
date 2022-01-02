package ch07.sec05;

public class ImportantPerson extends Member {
    int memberNo;
    String memberName;

    public ImportantPerson() {
    }



    public ImportantPerson(String name) {
        super(name);
        super.defaultName = "12";

    }

    public ImportantPerson(String name, int memberNo, String memberName) {
        super(name);

        this.memberNo = memberNo;
        this.memberName = memberName;
    }

    void setMemberInfo() {              // ssn, address, phoneNo 정보 입력(set)
        System.out.print("부모이름 입력 : ");
        name = sc.next();
        System.out.print("주민번호 입력 : ");
        setSsn(sc.next());
        System.out.println("주소 입력 : ");
        setAddress(sc.next());
        System.out.println("연락처 입력 : ");
        setPhoneNo(sc.nextInt());
    }

    void setImportantPerson() {
        System.out.println("학생번호 입력 : ");
        memberNo=sc.nextInt();
        System.out.println("학생이름 입력 : ");
        memberName=sc.next();
    }

    void printInfo() {
        System.out.println("부모이름 출력 : " + this.name);
        System.out.println("부모 주민번호 출력 : "+getSsn());
        System.out.println("주소 출력 : " +getAddress());
        System.out.println("연락처 출력 : "+getPhoneNo());
        System.out.println("학생번호 출력 : " + this.memberNo);
        System.out.println("학생이름 출력 : " + this.memberName);

    }
}