package creational.builder;

public class Main {

  public static void main(String[] args) {

    Person person =
        new PersonBuilder().id(1L).name("gurkan").surname("ucar").email("mail").age(22).build();

    System.out.println(person.toString());

    Book book = new Book.Builder().id(1L).isbn("1234").title("title").description("desc").build();

    Book book2 = Book.builder().id(1L).isbn("1234").title("title").description("desc").build();

    System.out.println(book.toString());
    System.out.println(book2.toString());
  }
}
