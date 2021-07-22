package day16_StringMethods;

public class WebName {
    public static void main(String[] args) {



        String url = "www.apple.com";

        int firstDote = url.indexOf(".")+1;
        int lastDote = url.lastIndexOf(".");
        String name = url.substring(firstDote, lastDote);

        String domain = url.substring(lastDote+1);

        System.out.println("name = " + name);
        System.out.println("domain = " + domain);

        System.out.println("++++++++++++++++++");

        String s2 = "Hello";
        boolean r1= s2.isEmpty();
        System.out.println("r1 = " + r1);


    }
}
