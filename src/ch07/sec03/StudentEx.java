package ch07.sec03;



public class StudentEx {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "011-646-4616", 4);

        student.inputJob();
        student.inputSsn();

        System.out.println("이름 : "+ student.name);
        System.out.println("주민번호 : "+ student.getSsn());
        System.out.println("연락처 : "+ student.phoneNo);
        System.out.println("학생번호 : "+ student.studentNo);
        System.out.println("부모직업 : "+ student.getJob());
    }
}
