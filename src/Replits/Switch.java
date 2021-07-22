package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Switch {
    public static void main(String [] args) {
     //   Scanner in = new Scanner(System.in);
     ///   int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
      //  Arrays.toString(do_switch(arr));

        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(do_switch(arr)));

    }


    public static int[] do_switch(int[] i) {
        // your codes here:

        int firstNum = i[0];
        int lastNum = i[i.length-1];

        i[0]=lastNum;
        i[i.length-1]=firstNum;




        return   i ;



    }
}
