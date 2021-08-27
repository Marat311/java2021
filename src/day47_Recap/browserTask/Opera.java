package day47_Recap.browserTask;

public class Opera extends Browser{

    @Override
    public void open() {
        System.out.println("Opening Opera browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Opera browser");
    }
}
