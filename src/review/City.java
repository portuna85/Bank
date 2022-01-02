package review;

public class City {
    private String city;
    private String roadName;
    private String zipCode;

    public City() {}

    public City(String city, String roadName, String zipCode) {
        this.city = city;
        this.roadName = roadName;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}