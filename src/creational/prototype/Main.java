package creational.prototype;


public class Main {
    public static void main(String[] args) {

        Person person = new Person(1, "gurkan",
                new Address("adress1", "istanbul", "abc Street No:10"));

        var person2 = person.copy();

        //override equals and hashcode if you want
        System.out.println("person.equals(person2) => " + person.equals(person2));
        System.out.println(person);
        System.out.println(person2);

    }
}