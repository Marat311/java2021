package day28_CustomMethods;

import javax.imageio.stream.ImageInputStream;

public class voidMethodsPractice {
    /*
    task:
    1. create a method that can print odd numbers between 1~100 in a same line seperated by space

    2. create a method that can print even numbers between 1~100

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
     */

    public static void main(String[] args) {
        printOddNUmber(100,125);
      //  printEvenNumber((int)10.5,(int) 100.5);
        printEvenNumber(100, 125);

        calculateAge(1983, 2037);

        eligibleToVote(38, true);

        calculate(200, '%', 100);


    }

    public static void printOddNUmber(int from, int to){


        for (int i = from; i <=to; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void printEvenNumber(int from, int to){
        for (int i = from; i <=to ; i++) {
            if(i%2==0){
              System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void calculateAge(int birthYear, int year){
        System.out.println("Your age is: "+(year-birthYear));

    }

    public static void eligibleToVote(int age, boolean isCitizen){
        if(age>=21 && isCitizen){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

    public static void calculate(int num1, char operator, int num2){
        switch (operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Substraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println(("Devision: "+num1/num2));
                break;
            case '%':
                System.out.println("Reminder: "+(num1%num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

}
