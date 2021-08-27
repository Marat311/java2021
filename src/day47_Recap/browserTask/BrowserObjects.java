package day47_Recap.browserTask;

public class BrowserObjects {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.open(); //open chrome

        Firexof firexof = new Firexof();
        firexof.open();//open firefox

        System.out.println("-------------------------------------");

        Opera opera = new Opera(); // opens the opera browser
        opera.open();
        opera.close();

        System.out.println("-------------------------------------");

        Edge edge = new Edge();
        edge.open();
        edge.close();

        System.out.println("-------------------------------------");
    }
}
