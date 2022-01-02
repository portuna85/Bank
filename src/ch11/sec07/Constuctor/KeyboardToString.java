package ch11.sec07.Constuctor;

import java.io.IOException;

public class KeyboardToString {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];
        System.out.println("입력 : ");

        int readByteNo = System.in.read(bytes);
        System.out.println(readByteNo);
        String str = new String(bytes, 0, readByteNo - 1);
        System.out.println(str);
    }
}