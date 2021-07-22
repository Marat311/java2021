package day29ReturnMethods;

public class returnMethodsPractice2 {
    public static void main(String[] args) {

        System.out.println(grade(100));
        String result = grade(50);
        System.out.println(result);
    }


    /*public static void grade(int score){
        if(score>100 || score<0){  //if the score is valid
            System.out.println("Invalid score");
            return; //exit the method
        }

        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }

     */

    public static String grade(int score) {

        String result = "Invalid";
        if (score <= 100 && score >= 0) {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        }
        return result;

    }
}