package Cal.haseok;

public class Lotto {
    private int num;

    private int makeLottoNumber() {
        this.num = this.setNum((int) (Math.random() * 45) + 1);
        return this.num;
    }

    public int setNum(int num) {
        this.num = num;
        return this.num;
    }

    public int getNum() {
        return this.num;
    }
}