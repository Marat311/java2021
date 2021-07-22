package day5_ArithmeticOperators;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number%2==0; //if the remainder of number /2 is equal to zero, then number is even
        boolean isOdd = number%2>0; //if the remainder of number /2 is greater then 0, then number is Odd

        System.out.println(number+" is an even number: "+isEven);
        System.out.println(number+" is an odd number: "+isOdd);
    }
}
