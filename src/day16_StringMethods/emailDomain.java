package day16_StringMethods;

public class emailDomain {
    public static void main(String[] args) {


        String emailAddress= "Cybertek.School@gmail.com";

        int beginningIndex = emailAddress.indexOf("@")+1;
        int endingIndex = emailAddress.lastIndexOf(".");

        String domain= emailAddress.substring(beginningIndex, emailAddress.length()-4);

        System.out.println("domain = " + domain);




    }
}
