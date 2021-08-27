package day48_Racap.Book;

public class Book {

    private final String title, type, author;
    private final int price;

    public Book(String title, String type, String author, int price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
