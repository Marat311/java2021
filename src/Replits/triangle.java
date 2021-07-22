package Replits;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        /*
        Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5

output:
*
**
***
****
*****
input: 5

output:
*
**
***
****
*****
Example:

input: 3

output:
*
**
***
         */
        int i = 1;
        int j = 1;
       // Scanner scan = new Scanner(System.in);
        int n = 5;//scan.nextInt();
        String star = "*";
        //           1<=5
        for(i = 1; i<=n; i++) {  //1

            for (j = 1; j <= i; j++) {
                System.out.print(star);


            }
            System.out.println();
        }



    }
}
