package Cal.sec10;

public class Singletone {

    private static Singletone st = new Singletone();

    private int maxCount;

    private Singletone() {
    }

    public static Singletone getMySingletone(){
        return st;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }
}