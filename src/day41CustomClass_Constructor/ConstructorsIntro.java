package day41CustomClass_Constructor;

public class ConstructorsIntro {

    public ConstructorsIntro(){ //constructor have access modifier and name(param){}
        System.out.println("Default constructor");

    }

    public ConstructorsIntro(int a ){
        System.out.println("Constructor with param");
    }

    public static void main(String[] args) {

        new ConstructorsIntro(10); //constructor mandatory gives class name


    }



}
