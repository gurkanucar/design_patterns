package creational.builder;

public class Book {
    private final Long id;
    private final String isbn;
    private final String title;
    private final String description;

    private Book(Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.description = builder.description;
    }

    public static class Builder {

        private Long id;
        private String isbn;
        private String title;
        private String description;

        public Book build() {
            return new Book(this);
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
