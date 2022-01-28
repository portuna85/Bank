package Example.sec07.exam02;

public class ContainerExam {
    public static void main(String[] args) {
        Container<String, String> co1 = new Container<String, String>();

        co1.set("홍길동", "도적");
        String name1 = co1.getKey();
        String job = co1.getValue();

        Container<String, Integer> co2 = new Container<String, Integer>();
        co2.set("홍길동", 34);
        String name2 = co2.getKey();
        int age = co2.getValue();
    }
}
