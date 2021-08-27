package day42_CustomClass_Constructors;

public class Test1 {
    public String name; //instance variable


    public static String school = "Cybertek" ;

    public Test1(String name){
        this.name = name;
    }


    static {
        school = "Cybertek";
    }
}
