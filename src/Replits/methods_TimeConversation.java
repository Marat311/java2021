package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class methods_TimeConversation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String result ="";
        s=s.trim();
        if(s.substring(0,2).equals("2:")){
            s="0"+s;
        }
        String hours = s.substring(0,2);
        if(s.contains("AM")){
            if(s.substring(0,2).equals("12")){
                s="00"+s.substring(2);

            }
            System.out.println( s.substring(0, s.length()-2));
        }else if(s.contains("PM")){
            switch(hours){
                case "01":
                    result="13";
                    break;
                case"02":
                    result="14";
                    break;
                case"03":
                    result="15";
                    break;
                case"04":
                    result="16";
                    break;
                case"05":
                    result="17";
                    break;
                case "06":
                    result="18";
                    break;
                case"07":
                    result="19";
                    break;
                case"08":
                    result="20";
                    break;
                case"09":
                    result="21";
                    break;
                case"10":
                    result="22";
                    break;
                case"11":
                    result="23";
                    break;
                case"12":
                    result="12";
                    break;

            }
            result+=":"+s.substring(3,s.length()-2);
            System.out.println(result);
        }



    }
}
    /*
   Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The timeConversion method should convert and print the given number (String argument)

Input: 07:05:45PM

Output: 19:05:45
Input: 07:05:45PM

Output: 19:05:45
Input: 07:15:55AM

Output: 07:15:55
     */


  /*      String s = "2:55:00PM ";
        s=s.trim();
        String result ="";
        if(s.substring(0,2).equals("2:")){
            s="0"+s;
        }
        String hours = s.substring(0,2);
        if(s.contains("AM")){
            if(s.substring(0,2).equals("12")){
                s="00"+s.substring(2);

            }
            System.out.println( s.substring(0, s.length()-2));
        }else if(s.contains("PM")){
            switch(hours){
                case "01":
                    result="13";
                    break;
                case"02":
                    result="14";
                    break;
                case"03":
                    result="15";
                    break;
                case"04":
                    result="16";
                    break;
                case"05":
                    result="17";
                    break;
                case "06":
                    result="18";
                    break;
                case"07":
                    result="19";
                    break;
                case"08":
                    result="20";
                    break;
                case"09":
                    result="21";
                    break;
                case"10":
                    result="22";
                    break;
                case"11":
                    result="23";
                    break;
                case"12":
                    result="12";
                    break;

            }
            result+=":"+s.substring(3,s.length()-2);
            System.out.println(result);
        }



    }

    public static void timeConversion(String s) {


        String [] time = s.split("");


    }
    */


