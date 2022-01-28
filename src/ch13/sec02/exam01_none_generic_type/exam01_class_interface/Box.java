package ch13.sec02.exam01_none_generic_type.exam01_class_interface;

public class Box {
    private Object object;

    public Box() {
    }

    public Box(Object object) {
        this.object = object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}