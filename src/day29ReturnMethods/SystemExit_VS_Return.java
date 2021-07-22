package day29ReturnMethods;

public class SystemExit_VS_Return {

    public static void main(String[] args) {
        passedOrFailed(150);

        System.out.println("Test complited");

    }

    public static void passedOrFailed(int score){

        if(score<=0 || score>=100){
            System.out.println("Invalid");
    // System.exit(0); //terminates everything, cant print on main method others print statement
          return; //exit the current method
        }
        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
