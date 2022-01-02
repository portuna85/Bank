package ch11.sec08;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String text = "홍길동&김길동,홍삼삼";

        String[] names = text.split("&|,");
        for(String name : names)
            System.out.println(name);
    }
}
