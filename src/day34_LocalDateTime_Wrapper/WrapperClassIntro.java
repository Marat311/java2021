package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {

    public static void main(String[] args) {


        short s =10;
        int num1 = 3;
        Integer n = num1;

        //autoboxing
        Integer num = 10;
        Integer num2 = (int)s; //autoboxing; convert primitive value to wrapper class value

        char ch = '@';
        Character ch1 =(Character) ch; //done automaticly and it is autoboxing

        //unboxing
        Byte b1 = 10;
        byte b2= b1; //unboxing, converting Byte wrapper class to byte primitive
        short b3 = b1;//unboxing converting Short wrapper class to short primitive
        int b4 = b1;
        long b5 = b1;
        float b6 = b1;
        double b7 = b1;

        System.out.println("--------------------");

        byte c1 = 10;
        Byte c2 = c1;//wrapper class only accepts it's own primitive
        Short c3 = (short)c1; //autoboxing
        Integer c4 = (int)c1;//we need reassign byte to int, because wrapper class accept only it's own primitives









    }
}
