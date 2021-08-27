package day41CustomClass_Constructor;

//import Utilities.Data;
import Utilities.Data;

import static Utilities.Data.str3;

public class ImportStatements {

    public static void main(String[] args) {

       /*
        Data data = new Data();
        System.out.println(data.str1);
        System.out.println(data.str2);
        System.out.println(Data.str3);
        System.out.println(Data.str4);
        */

        System.out.println("--------static import----------");

        //if we import static class with static variables or methods, we dont need to call class
        System.out.println(str3);


    }
}
