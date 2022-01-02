package ch07.sec05;

public class PersonEx {
    public static void main(String[] args) {
        ImportantPerson person = new ImportantPerson();

        // ImportantPerson person1 = new Member();

        Member mem = new ImportantPerson();



        person.setMemberInfo();

        person.setImportantPerson();

        person.printInfo();
    }
}