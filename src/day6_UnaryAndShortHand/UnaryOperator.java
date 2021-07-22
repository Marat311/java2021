package day6_UnaryAndShortHand;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 100;
        ++a; // pre increment
        System.out.println(a+" pre increment");
        a++; //post increment
        System.out.println(a+" post increment");

        int b = 100;
        --b; //pre decrement
        System.out.println(b +"pre decrement");
        b--; //post decrement
        System.out.println(b+" post decrement");
        System.out.println("--------------------");

        int x = 10;
        System.out.println(++x); //11 pre; chsnge the value by 1 immediately
        System.out.println(x++); //10+1 post; first passes the current value, then change pass the value, change it by 1
        System.out.println(x);  //12

        System.out.println("------------------");





    }
}
