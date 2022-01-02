package Example;

public class ForByExam {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println();
            System.out.printf("%d단 %n", i);
            for (int j = 1; j <10 ; j++) {
                System.out.printf("%d X %d = %d %n", i,j,i*j);
            }

        }
    }
}
