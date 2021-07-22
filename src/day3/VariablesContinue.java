package day3;

public class VariablesContinue {

    public static void main(String[] args) {
        boolean result1 = true;
        boolean result2 = false;


        boolean result3 = 10>9; //true
        System.out.println(result3);

        System.out.println(true==false); //false

        System.out.println("Muhtar" == "Good Guy"); //true

        System.out.println("Muhtar "!= "Good Guy"); //true

        boolean r1 = true !=true; //false
        boolean r2 = "B17" == "B18"; //false

        char ch1 = 'A';
        System.out.println(ch1); //A

        char ch2 = 50; //corresponding number
        System.out.println(ch2); //2 - character, not number

        char ch3 = 100; //d
        System.out.println(ch3); //d

        char ch4 = 'D'; //68
        System.out.println(ch4);  //D

        int num1 = 'D';

        System.out.println(num1); //68 corresponding number, because accept only numbers

        char a1 = 'z';
        //byte b1 = a1; //char larger then byte
        byte b1 = 'z'; //122, byte not bigger then 128

        //short s1 = a1; //char larger then short

        int i1 = a1; //int larger then char
    }
}
