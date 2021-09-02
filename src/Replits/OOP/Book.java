package Replits.OOP;

public class Book {
    int pages;
    static String author;

    static {
        author = "Stiven King";
    }

    public void set(int pages){
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.set(500);
        b1.author = "Christopher Paolinni";
        Book b2 = new Book();

        System.out.println(b1.author.equals(b2.author) + " ");
        System.out.println(b1.pages == b2.pages);
        System.out.println(b1.pages);
        System.out.println(b2.pages);

    }

}
