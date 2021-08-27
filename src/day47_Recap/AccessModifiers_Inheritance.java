package day47_Recap;

import Utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {

    public void method(){
        System.out.println(publicVariable);
        System.out.println(protectedVariable); //protected can be visible outside the package in sub class, so we need inherit parent class
      //  System.out.println(defaultVariable); can not inherited in another package
        //  System.out.println(privateVariable); //only visible in same class

        publicMethod();
        protectedMethod();
       // defaultMethod();
        //privateMethod();
    }
}
