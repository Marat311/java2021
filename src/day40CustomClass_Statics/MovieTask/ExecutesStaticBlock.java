package day40CustomClass_Statics.MovieTask;

public class ExecutesStaticBlock {

    static {  //static block runs ones and at the bigginning, no need to call
        System.out.println("static block");
    }

    public static void method1(){ //calls when we call it
        System.out.println("Method 1");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}
