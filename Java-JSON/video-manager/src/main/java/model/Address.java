package model;

/**
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class Address {
    private String nation;
    private String city;
    private String district;

    public Address(){}

    public Address(String nation, String city, String district) {
        this.nation = nation;
        this.city = city;
        this.district = district;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "nation='" + nation + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
