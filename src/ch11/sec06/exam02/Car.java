package ch11.sec06.exam02;

public class Car {
    private String model;
    private String owner;

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String owner() {
        return owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }
}
