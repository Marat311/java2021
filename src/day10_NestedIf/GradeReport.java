package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        
        
        int score = 135;
        String grade= ""; //A, B, C, D, F
        
        //Nested If
        if(score>=0 && score <=100){ //Pre-condition ia the score is valid
            
            if(score>=90){
                grade="A";
            }else if(score>=80){
                grade="B";
            }else if(score>=70){
                grade="C";
            }else if(score>=60){
                grade="D";
            }else {
                grade="F";
            }
        }else{  //opposite of pre condition: if the score is invalid
            grade="Invalid";
        }
        System.out.println("grade = " + grade);
        
        

        
        
    }
        
        
        
        
}
