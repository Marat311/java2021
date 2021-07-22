package Replits;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String email = scan.next();



        String r = "";
        if(email.contains("_")) {
            int index = email.indexOf("_");
            String firstName = email.substring(0, index);
            String secondName = email.substring(index+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));

            r+= secondName+"_"+ firstName + domain;
        }else{

            r+=email;
        }
        System.out.println(r);
        scan.close();

}}


