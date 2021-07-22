package Replits;

import java.util.Scanner;

public class methods_withReturnMax {
    /*
    Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x
Example:

max(1,10) -> 10
max(1,10) -> 10
max(11,5) -> 11
     */

    public static int max(int x, int max){
        // Code here
if(max>x){
    return max;
}else{
    return x;
}




    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
        in.close();
    }

}
