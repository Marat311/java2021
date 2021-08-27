package day43_OOP_Encapsulation;

public class AccessModifiers {

    public static int publicVariable = 100;
    protected static int protectedVariable = 200;
    static int defaultVariable = 200; //default
    private  static int privateVariable = 200;

    public static void main(String[] args) {

        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(privateVariable);
        System.out.println(defaultVariable);
    }
}
