package ch11.sec08;

import java.util.StringTokenizer;

public class StringTokenizerExam {
    public static void main(String[] args) {
        String str1 = "홍길동/김길동/홍홍홍";

        StringTokenizer st = new StringTokenizer(str1, "/");
       /* int coutnToken = st.countTokens();
        for(int i=0;i<coutnToken;i++) {
            String tk = st.nextToken();
            System.out.println(tk);
        }*/
        System.out.println();

        while(st.hasMoreTokens()) {
            String tk = st.nextToken();
            System.out.println(tk);
        }
    }
}
