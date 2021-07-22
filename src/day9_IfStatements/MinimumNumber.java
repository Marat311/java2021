package day9_IfStatements;

public class MinimumNumber {
    public static void main(String[] args) {

      int num1 = 20, num2 = 30;

     if(num1<num2){
        System.out.println(num1+ " is minimum then "+num2);
    }

        if(num2<num1){
        System.out.println(num2+ " is minimum then "+num1);
    }

        System.out.println("___________________");

        if(num1<num2){
            System.out.println(num1+ " is minimum then "+num2);
        }else{
            System.out.println(num2+ " is minimum then "+num1);
        }

    }
}