package Replits;

import java.util.Scanner;

public class separatorWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String sep = scan.next();
        int num = scan.nextInt();
        String r = "";


        for(int i = 0; i<num; i++){


          r+=word+sep;



        }

     r=r.substring(0, r.length()-sep.length());


        System.out.println(r);


    }
}
