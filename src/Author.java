import java.util.Objects;
public class Author {
    public final String name;
    public final String surname;
    private Object other;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object other) {
        this.other = other;
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return name.equals(c2.name);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
