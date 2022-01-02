package ch11.sec08;

public class StringBuilderExam {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("JAVA ");
        sb.append("Programming");
        System.out.println(sb.toString());

        sb.insert(4, 2);
        System.out.println(sb.toString());

        sb.setCharAt(4, '6');
        System.out.println(sb.toString());

        sb.replace(6, 17, "BOOK");
        System.out.println(sb.toString());

        sb.delete(4, 5);
        System.out.println(sb.toString());

        System.out.println(sb.length());
    }
}
