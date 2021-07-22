package day8_ifStatement;

public class GradeReport {
    public static void main(String[] args) {

        /*
        score

        grade:
        A: 90<=score <=100
        B: 80 <=score <= 89
        C: 70 <=score <= 79
        D: 60 <=score <=69
        F: score < 60
         */

        int score = 85;

        if(score>=90 && score <=100){
            System.out.println("Excellent, You made an A");
        }

        if(score>=80 && score <=89){
            System.out.println("Good job, You made an B");
        }

        if(score>=70 && score <=79){
            System.out.println("Very good, You made an C");
        }

        if(score>=60 && score <=69){
            System.out.println("Good, You made an D");
        }

        if(score<60){
            System.out.println("You need work higher, You made an F");
        }
    }
}
