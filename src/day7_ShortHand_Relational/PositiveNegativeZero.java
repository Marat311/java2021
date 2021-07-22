package day7_ShortHand_Relational;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        int number = -100;
        boolean isPositive = number >0;
        boolean isNegative = number<0;
        boolean isZero = number==0;
        // boolean isZero = isNegative ==false && isPositive ==false;
        // boolean isPositive = isNegative ==false && isZero == false;

        System.out.println(number +" is Negative number: " + isNegative);
        System.out.println(number +" is Positive number: " + isPositive);
        System.out.println(number +" is Zero: " + isZero);


    }
}
