package day37CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class rectanglePractice {

    public static void main(String[] args) {



        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 3.3;  //if we dont use method setInfo it getInfo method use variables without method
       r.setInfo(2.5, 5.5); //but if we use method setInfo getInfo method takes on method variables, bc java executes top to bottom!

        System.out.println("-------------------------");
        System.out.println(r.toString());//toString method done implicitly, we don't need call this method
       // r.getInfo();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Robb", "Bran", "Rick", "Bran"));
        if(names.remove("Bran")){
            names.remove("John");
        }
        System.out.println(names);



    }
}
