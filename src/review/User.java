package review;

public class User extends City{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String city, String roadName, String zipCode) {
        super(city, roadName, zipCode);
    }

    public User(String name, int age, String city, String roadName, String zipCode) {
        super(city, roadName, zipCode);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}