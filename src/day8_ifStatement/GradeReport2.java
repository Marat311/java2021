package day8_ifStatement;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 99;

        boolean madeA = score >=90 && score <=100;
        boolean madeB = !madeA && score >=80; //did not make A and score is greater or equal to 80
        boolean madeC = !madeA && !madeB && score >=70; //did not make A & B and score is greater or equal to 70
        boolean madeD = !madeA && !madeB && !madeC && score >=60; //did not make A & B & C and score is greater or equal to 60
        boolean madeF = !madeA && !madeB && !madeC && !madeD && score <60; //did not make A & B & C & D

        if(madeA){
            System.out.println("Excellent, You made an A");
        }

        if(madeB){
            System.out.println("Good job, You made an B");
        }

        if(madeC){
            System.out.println("Very good, You made an C");
        }

        if(madeD){
            System.out.println("Good, You made an D");
        }

        if(madeF){
            System.out.println("You need work higher, You made an F");
        }

    }
}
