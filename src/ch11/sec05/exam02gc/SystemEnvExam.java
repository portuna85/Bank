package ch11.sec05.exam02gc;

public class SystemEnvExam {
    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("[JAVA_HOME] : " + javaHome);
    }
}