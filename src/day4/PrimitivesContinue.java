package day4;

public class PrimitivesContinue {
    /*
    char : for single character only, ''
    boolean:
     */
    public static void main(String[] args) {

        // #
        char ch1 = '#'; //single character
        char ch2 = 35; //it is corresponding number for single character and it will be  #

        System.out.println(ch1); //#
        System.out.println(ch2); //#

        // Z
        char ch3 = 'Z';
        char ch4 = 90; //Z
        char ch5 = 65000; // ﷨
        System.out.println("ch3 =" +ch3);
        System.out.println("ch4 =" +ch4);
        System.out.println("ch5 =" +ch5);

        char ch6 = 15+25; //give us single character

        System.out.println("ch6 =" +ch6);

        System.out.println("========================");

        //10>9
        boolean r1 = 10>9;
        System.out.println("r1 =" +r1);

        boolean r2 = true;
        boolean r3 = false;

        System.out.println("r2 = "+r2);
        System.out.println("r3 ="+r3);

        boolean isFullTime = false;
        boolean isMarried = false;
        boolean isPandemic = true;

        /*
        if is Pandemic:
        buy toilet papers
         */

        boolean r4 = "Java" == "Python";
        boolean r5 = "Muhtar" == "Good guy"; //false
        boolean r6 = "Muhtar" == "Muhtar";  //true
        System.out.println(r4);
        System.out.println(r6);






    }
}
