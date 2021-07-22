package day17_StringContinue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Account_number {

    public static void main(String[] args) {
/*
.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do
    not meet the expected results print “Invalid account number”

 */

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your account number");
        String account = s.next();

        if(account.length()==7 || account.length()==10){
            if(account.charAt(0)=='2' && account.length()==7){//if 1 character is 2 && has 7 characters in total
                System.out.println("Valid account");
            }else if(account.charAt(0)=='5' && account.length()==10){// //if 1 character is 2 && has 10 characters in total
                System.out.println("Valid account");
            }else{
                System.out.println("Invalid account");
            }
        }else{
            System.out.println("Invalid account");
        }

        char firstChar = account.charAt(0);
        switch(firstChar){
            case '2':  //if the first character of account is 2
                if(account.length()==7){
                    System.out.println("Valid account");
                }else{
                    System.out.println("Invalid account, should be 7 characters long");
                }
                break;
            case '5':
                if(account.length()==10){
                    System.out.println("Valid account");
                }else{
                    System.out.println("Invalid account");
                }
                break;
            default:
                System.out.println("Invalid account");
                s.close();

        }



    }
}
