public class Book {
    private String book_name;
    private String book_url;

    public Book(String book_name, String book_url) {
        this.book_name = book_name;
        this.book_url = book_url;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_name='" + book_name + '\'' +
                ", book_url='" + book_url + '\'' +
                '}';
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_url() {
        return book_url;
    }

    public void setBook_url(String book_url) {
        this.book_url = book_url;
    }
}
