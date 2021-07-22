package day7_ShortHand_Relational;

public class SwipeTwoNumbers {

    public static void main(String[] args) {

        int a = 20,
            b = 30;

        a += b; //a = 50
        b = a-b; //b = 20
        a -= b; //a = 30

       /* int c = a; //20
        a = b; //30
        b = c; //20

        */
        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }


}
