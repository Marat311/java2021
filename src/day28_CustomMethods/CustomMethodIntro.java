package day28_CustomMethods;

public class CustomMethodIntro {
    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Muhtar");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

    }

    public static void printHello5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello");
        }
    }
}
