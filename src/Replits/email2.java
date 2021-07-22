package Replits;

import java.util.Locale;
import java.util.Scanner;

public class email2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        int index = email.indexOf("_");
        String firstName = email.substring(0, index);
        firstName=((""+firstName.charAt(0)).toUpperCase()+firstName.substring(1));

        String secondName = email.substring(index+1, email.indexOf("@"));
        secondName=(""+secondName.charAt(0)).toUpperCase()+secondName.substring(1);
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("First name: "+firstName);
        System.out.println("secondName = " + secondName);
        System.out.println("domain = " + domain);

        scan.close();



    }
}
