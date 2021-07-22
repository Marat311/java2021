package day8_ifStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int score = 70;
        boolean passed = score>=60;

        if(passed){
            System.out.println("Congrats you passed the exam");
        }

        if(score<60){

            System.out.println("You failed the exam");
        }
    }

}
