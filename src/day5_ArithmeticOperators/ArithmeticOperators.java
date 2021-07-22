package day5_ArithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10f/3); //3.333.. (10Float)
        System.out.println(25.0/2); //12.5
        System.out.println(25d/2); //12.5 (25double)
       // System.out.println(10/0); division can not be 0

       double b = 100/3; //33.0
            //b = 33==> 33.0
        System.out.println("b ="+b);

        double c = 100.0/3; //33.3333..

        System.out.println("c ="+c);

        int n1 = 100;
        int n2 = 40;
        // remainder = 100-(40*2)=20
        System.out.println(n1%n2);//remainder 20

        int num1 = 10;
        int num2 = 3;
        int result = num1/num2;
        int remainder = num1%num2;
        System.out.println(num1+" divide by "+num2+" is equal to "+result+" with a remainder of "+remainder); //1



    }
}
