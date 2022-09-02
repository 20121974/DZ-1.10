import java.util.Objects;
public class Book {
    private final String name;
    private final Author author;
    private Integer publicationYear;

    public Book(String name, Author author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public boolean equals (Object other){
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return name.equals(c2.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);

    @Override
    public String toString() {
        return name + author + publicationYear;
        }

    }