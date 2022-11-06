package creational.prototype;

import java.util.Objects;

public class Person implements Prototype {

    private int id;
    private String name;
    private Address address;

    @Override
    public Person copy() {
        return new Person(this);
    }

    public Person(Person copyFrom) {
        this.id = copyFrom.id;
        this.name = copyFrom.name;
        this.address = copyFrom.address.copy();
    }

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
