package creational.builder;

public class PersonBuilder {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Integer age;

    public Person build() {
        return new Person(this.id,
                this.name,
                this.surname,
                this.email,
                this.age);
    }


    public PersonBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public PersonBuilder name(String name){
        this.name=name;
        return this;
    }
    public PersonBuilder surname(String surname){
        this.surname=surname;
        return this;
    }
    public PersonBuilder email(String email){
        this.email=email;
        return this;
    }
    public PersonBuilder age(Integer age){
        this.age=age;
        return this;
    }
}
