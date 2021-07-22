package day7_ShortHand_Relational;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 101;
        boolean even= number %2 ==0;  //even : if a number can be divided by 2 with 0 remainder

        boolean odd = even ==false; //if the number is not even number, then it's odd number
                     //number%2>0;
                     //number!=0;
        System.out.println(number + " is odd number: " + odd);
        System.out.println(number+ " is even number: " + even);




    }
}
