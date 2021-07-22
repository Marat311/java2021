package Replits;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();

        int num = scan.nextInt();
        String r = "";


        for(int i = 1; i <= num; i++){


            if(separator.charAt(i)>='A' && separator.charAt(i)<='Z'){ //if the characters is upper case from the string
                r+=word+separator.charAt(i);

            }else  if (separator.charAt(i)>='a'&& separator.charAt(i)<='z') {  //if the character is lower case letter
                r += word+separator.charAt(i);

            }else if(separator.charAt(i)>='0' && separator.charAt(i)<='9'){  //if the character is digit
                r += word+separator.charAt(i);

            }else {  //if the character is special char
                r+=word+separator.charAt(i);
            }

        }
      //  r+=word+separator;

        r= r.substring(0, r.length()-separator.length());
    /* if(r.contains("[2K")){
     r=r.replace("[2K", "");
     }
     */

        System.out.print(r);
    }
}

