package ch11.sec07.method;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringGetBytesExam {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "안녕하세요";


        // encoding
        byte[] byte1 = str.getBytes("EUC-KR");


        // decoding
        String str1 = new String(byte1);
        String str2 = new String(byte1, "EUC-KR");
        System.out.println("byte1 ->> str1 : " + str1);
        System.out.println("str2 = " + str2);





        try {
            byte[] byte2 = str.getBytes("EUC-KR");
            System.out.println("byte2.length : " + byte2.length);

            System.out.println("byte2 = " + byte2);

            //String str2 = new String(byte2, "UTF-16");
            //System.out.println("str2 = " + str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}