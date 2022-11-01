package creational.builder;

public class Main {

    public static void main(String[] args) {

        Person person = new PersonBuilder()
                .id(1L)
                .name("gurkan")
                .surname("ucar")
                .email("mail")
                .age(22)
                .build();

        System.out.println(person.toString());

    }

}
