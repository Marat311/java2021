package day47_Recap.browserTask;

public final class Edge extends Browser {
    @Override
    public void open() {
        System.out.println("Opening Edge browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Edge browser");
    }
}