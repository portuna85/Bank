package Example.sec07.exam01;

public class ContainerExam {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();

        container1.setT("홍길동");
        String str = container1.getT();

        Container<Integer> container2 = new Container<>();

        container2.setT(10);
        int value = container2.getT();
    }
}