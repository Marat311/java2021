package day9_IfStatements;

public class PassOrFailed {
    public static void main(String[] args) {

        int score = 60;

        if(score>=60){
            System.out.println("Passed");
        }

        if(score<60)
            System.out.println("Failed");


        if(score>=60)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
