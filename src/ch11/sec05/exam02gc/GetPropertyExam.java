package ch11.sec05.exam02gc;

import org.w3c.dom.ls.LSOutput;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExam {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("운영체제 : " + osName);
        System.out.println("사용자 : " + userName);
        System.out.println("사용자 홈디렉토리 : " + userHome);

        System.out.println("-------------------------------");
        System.out.println(" [ KEY ] VALUE");
        System.out.println("-------------------------------");

        System.out.println(System.getenv("JAVA_HOME"));

        Properties properties = System.getProperties();
        Set keys = properties.keySet();
        for (Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println("[ " + key + " ] " + value);
        }
    }
}
