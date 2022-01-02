package ch11.sec07.Constuctor;

public class ByteToStringExam {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
        String str3 = "Hello JAVA";

        System.out.println(bytes);
        String str1 = new String(bytes);
        System.out.println(str1);


        String str2 = new String(bytes, 2, 6);
        System.out.println(str2);
    }
}
