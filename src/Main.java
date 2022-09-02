public class Main {
    public static void main(String[] args) {
        var author = new Author("Author", "Family");
        var author1 = new Author("Author1", "Family1");
        var author2 = new Author("Author2", "Family2");
        var book = new Book("Book", author, 1926);
        var book1 = new Book("Book1", author1, 1990);
        var book2 = new Book("Book2", author2, 2022);

        book.setPublicationYear(2021);

        System.out.println(book);



    }
}