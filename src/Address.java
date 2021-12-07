public class Address {

    private int zipCode;
    private String city;
    private String state;

    public Address() {
    }

    public Address(int zipCode, String city, String state) {
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}