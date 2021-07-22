package day10_NestedIf;

public class EligibleToAlcohol {
    public static void main(String[] args) {


    int age = 21;
    String eligibleToBuyAlchogol="";

    if(age>=21) {
        eligibleToBuyAlchogol="Eligible";
    }    else{
        eligibleToBuyAlchogol="Not eligible";
    }
        System.out.println("eligible To Buy Alcohol = " + eligibleToBuyAlchogol);

   String eligibleToAlchogol = (age>=21)? "Eligible":"Not eligible";
        System.out.println("eligible To Alcohol = " + eligibleToAlchogol);

    int score = 80;
        System.out.println((score>=60)?"Pass":"Failed");






    }
}
