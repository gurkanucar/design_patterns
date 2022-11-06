package creational.prototype;

import java.util.Objects;

public class Address implements Prototype {

    private String title;
    private String city;
    private String detail;

    Address(String title, String city, String detail) {
        this.title = title;
        this.city = city;
        this.detail = detail;
    }

    Address(Address copyFrom) {
        this.title = copyFrom.title;
        this.city = copyFrom.city;
        this.detail = copyFrom.detail;
    }

    @Override
    public Address copy() {
        return new Address(this);
    }

    public String getTitle() {
        return this.title;
    }

    public String getCity() {
        return this.city;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
