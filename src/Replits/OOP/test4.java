package Replits.OOP;

public class test4 {
    static boolean a = false;
    int num=0;

    public static void main(String[] args) {
        System.out.println(a);
        a=A();
        System.out.println(a);
    }

    public static boolean A(){

        return !a;
    }

}
