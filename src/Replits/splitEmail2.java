package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class splitEmail2 {
    public static void main(String[] args) {
        /*
 Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
email -> hello-gmail.com

Output:
invalid email
email -> my@fancy@email.com

Output:
invalid email
         */
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        //String arr[] = new String[email.length()];


        int count=0;

   /*     for (int i = 0; i <email.length(); i++) {
            char ch = email.charAt(i);
            if(ch=='@'){
                count++;
            }
        }
        if(count==1){
          String[]  arr = email.split("@", 2);
            System.out.println("Email id: "+arr[0]);
            System.out.println("Email domain: "+arr[1]);
        }else {
            System.out.println("invalid email");


    }

*/

        String[]  arr = email.split("@");

        if(arr.length>2 || !email.contains("@")){
            System.out.println("Invalid item");
        }else{
            System.out.println("Email id: "+arr[0]);
            System.out.println("Email domain: "+arr[1]);
        }


    }
}
