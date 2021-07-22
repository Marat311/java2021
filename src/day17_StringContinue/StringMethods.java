package day17_StringContinue;

public class StringMethods {
    public static void main(String[] args) {

        String sentence2 = "Cybertek School is the best";

        boolean startWithCybertek = sentence2.startsWith("Cybertek");
        boolean startsWithSchool = sentence2.startsWith("School");

        System.out.println("startWithCybertek = " + startWithCybertek);
        System.out.println("startsWithSchool = " + startsWithSchool);

        System.out.println("==============");

        boolean endWith = sentence2.endsWith("best");

        System.out.println("endWith = " + endWith);

        System.out.println("=============================");

        String gmail = "cybertek@gmail.com";

        boolean result = gmail.endsWith("@gmail.com");

        System.out.println(result);

    }


}
