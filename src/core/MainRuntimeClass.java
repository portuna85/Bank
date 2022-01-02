package core;

public class MainRuntimeClass {

    public static void main(String[] args) {

        int core = Runtime.getRuntime().availableProcessors();
        System.out.println("core = " + core);
    }
}
