package Replits;

import java.util.Scanner;

public class characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);


        String res = "";
        //      A  65      Z 90
        for(char i=start; i<=end;i++) {

            char each = i;


            if (each >=start && each<=end) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
