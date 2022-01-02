package ch11.sec07.method;

public class StringReplaceExam {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향 언어입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);

        System.out.println(oldStr.length());
        System.out.println(newStr.length());
    }
}
