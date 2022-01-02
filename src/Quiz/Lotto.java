package Quiz;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[]{};

        double num = Math.random();

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (num * 10);
            System.out.println(lotto[i]);
        }

    }
}