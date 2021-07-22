package Replits;

public class method_threeLocks {
    public static void main(String[] args) {
        System.out.println(threeLocks(false, true, true));
    }
    /*
    threeLocks accepts 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

Hint: See truth table
     */

    public static boolean threeLocks(boolean a, boolean b, boolean c){
        if(a==true && b==true || c==true){
             return true;
        }else{
            return false;
        }
    }


}
