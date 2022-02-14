package ch06.sec07.exam02_call_constructor.exam02_overroding_constructor;

public class Car {
    public String company = "현대자동차";
    public String model;
    public String color;
    public int maxSpeed;

    public Car() {
    }

    public Car(String model) {
        this(model, null, 0);
    }

    public Car(String model, String color) {
        this(model, color, 0);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
