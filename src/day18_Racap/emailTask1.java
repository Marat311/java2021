package day18_Racap;

public class emailTask1 {
    /*
    1. EmailTask1:
            Assume that email address is constructed by person's first name and followed by an underscore and last name.
            Write a program that can swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
     */

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";
        int indexOf = email.indexOf("_");  //returns the index number of the underscore from the mail
        String firstName = email.substring(0, indexOf); //returns the index number of @ in email
        String lastName = email.substring(indexOf+1, email.indexOf("@"));
        String mail = email.substring(email.indexOf("@"));

        System.out.println(lastName+"_"+firstName+mail);



    }


}
