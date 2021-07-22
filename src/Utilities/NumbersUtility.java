package Utilities;

public class NumbersUtility {

    //isOdd
    public static boolean isOdd(int num){
        boolean result = num%2!=0;
        return result;
    }

    //isEven
    public static boolean isEven(int num) {
        boolean result = num % 2 == 0;
        return result;
    }

    //addition
    public static int isAddition(int num1, int num2){
        int result = num1+num2;
        return result;
    }


    //subtraction
    public static int isSubtraction(int num1, int num2){
        int result = num1-num2;
        return result;
    }



    //max
    public static int isMax(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }


    //min
    public static int isMin(int num1, int num2){
        if(num1>num2){
            return num2;
        }else{
            return num1;
        }
    }


    //cube

    public static int cube(int num){
        int result = num*num*num;
        return result;
    }
}
