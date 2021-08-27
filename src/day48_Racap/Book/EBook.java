package day48_Racap.Book;

public class EBook extends Book{

    private final int size, pages;

    public EBook(String title, String type, String author, int price, int size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public int getPages() {
        return pages;
    }

    public void readBook(){
        System.out.println("reading book "+getTitle());
    }

    @Override
    public String toString() {
        return "EBook{" +
                "size=" + size +
                ", pages=" + pages +
                '}';
    }
}
