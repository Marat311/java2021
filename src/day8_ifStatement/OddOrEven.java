package day8_ifStatement;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 101;

        boolean odd = number%2 !=0;

        if(odd){
            System.out.println(number+ " is odd number");
        }


        if(!odd){
            System.out.println(number+" is even number");
        }




    }
}
