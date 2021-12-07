package Cal.haseok;

public class MyCar {

    private int speed;

    public void setSpeed(int speed) {

        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }

    }

    @Override
    public String toString() {
        return "MyCar{" +
                "speed=" + speed +
                '}';
    }

    public int getSpeed() {
        return this.speed;
    }

    public void decreaseSpeed(int speed) {
        this.speed -= speed;
    }
}
