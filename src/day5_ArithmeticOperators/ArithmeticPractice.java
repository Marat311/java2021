package day5_ArithmeticOperators;

public class ArithmeticPractice {

    public static void main(String[] args) {

        int number = 15;

        boolean isEvenlyDivisibleBy3 = number%3==0;
        System.out.println(number+" is evenly divisible by 3: "+isEvenlyDivisibleBy3);


        boolean isEvenlyDivisibleBy5 = number%5==0; //if remainder of number/5 is 0, then i's evenly divisible by 5

        System.out.println(number+" is evenly divisible by 5: "+isEvenlyDivisibleBy5);


    }
}
