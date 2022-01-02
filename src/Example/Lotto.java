package Example;

public class Lotto {
    public int[] lotto = new int[6];

    public Lotto(int[] lotto) {
        this.lotto = lotto;
    }

    public int[] lotto() {
        return lotto;
    }

    public void setLotto(int[] lotto) {
        this.lotto = lotto;
    }
}