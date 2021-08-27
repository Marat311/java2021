package day48_Racap.Book;

public class AudioBook extends Book{
    private final int length;
    private final String narrator;

    public AudioBook(String title, String type, String author, int price, int length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public int getLength() {
        return length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void listen(){
        System.out.println("listening audio book "+getTitle()+" with narrator "+getNarrator());
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
