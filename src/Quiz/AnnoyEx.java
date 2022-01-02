package Quiz;

public class AnnoyEx {
    public static void main(String[] args) {
        Annoymous annoymous = new Annoymous();
        annoymous.field.run();
        annoymous.method1();
        annoymous.method2(
                new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("트럭이 달립니다.");
                    }
                }
        );

    }
}
