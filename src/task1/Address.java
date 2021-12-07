package task1;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private String house;
    private int flat;

    public Address(String city, String street, String house, int flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public void showAddress(){
        System.out.println("Адреса: м." + this.city + " вул. " + this.street + " " + this.house + "/" + this.flat);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {  return house;  }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return flat == address.flat &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(house, address.house);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, house, flat);
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}

