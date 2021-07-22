package day20_Loops;

public class factorialNumber {
    public static void main(String[] args) {
/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
        int num = 5; //5*4*3*2*1
        int result = 1;

        for (int i = num; i >=1 ; i--) { //i: 5,4,3,2,1
            result*=i;

        }
        System.out.println(result);



    }
}
