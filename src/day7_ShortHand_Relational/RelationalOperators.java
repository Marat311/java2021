package day7_ShortHand_Relational;

public class RelationalOperators {
    public static void main(String[] args) {

        //> -greater, >= greater or equal
        System.out.println( 10>11);  //false
        System.out.println(10>=10); //true

        System.out.println(11>=9); //true
        System.out.println(20>=200); //false


        //< -less, <= -less or equal
        System.out.println(1000<100); //false
        System.out.println(1000<10000); //true

        System.out.println(10000<=1000); //false
        System.out.println(1000<=10000); //true

        //== equal, != not equal

        System.out.println(5==6); //false
        System.out.println(5!=6); //true

        System.out.println('a' =='A'); //false
        System.out.println('a' !='A'); //true

        System.out.println("Java" == "java"); //false
        System.out.println("Java" != "java"); //true



    }
}
