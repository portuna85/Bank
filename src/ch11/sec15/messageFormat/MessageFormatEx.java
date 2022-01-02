package ch11.sec15.messageFormat;

import java.text.MessageFormat;

public class MessageFormatEx {
    public static void main(String[] args) {
        String id = "Dragon";
        String name = "신용권";
        String tel = "010-646-4971";

        String text = "회원 ID: {0} \n회원 이름 : {1} \n회원 전화: {2}";
        String result1 = MessageFormat.format(text, id, name, tel);
        System.out.println(result1);
        System.out.println();

        String sql = "insert into member value({0}, {1}, {2})";
        Object[] obj = {"'JAVA'", "'신용권'", "'017-469-7946'"};
        String result2 = MessageFormat.format(sql, obj);
        System.out.println(result2);
    }
}